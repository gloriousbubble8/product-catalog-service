pipeline {

    agent any

    environment {
        IMAGE_NAME = 'giridhar8888/product-catalogue-service'
        IMAGE_TAG = '1.0.4'
        ENV = 'dev'
    }

    stages {

        stage('verify'){
             steps {
                sh '''
                    echo "=== Git commit ==="
                    git log -1 --oneline

                    echo "=== Project files ==="
                    ls -la
                '''
            }
        }

        stage('build'){
            steps {
                sh './mvnw clean install'
            }
        }

        stage('Build Docker Image'){
            steps {
                sh 'docker build -t $IMAGE_NAME:$IMAGE_TAG .'
            }
        }

        stage('Publish Image'){
            steps {
                    withCredentials(
                        [
                            usernamePassword(
                                credentialsId: 'dockerhub-credentials',
                                usernameVariable: 'DOCKER_USERNAME',
                                passwordVariable: 'DOCKER_PASSWORD'
                            )
                        ]
                    ){
                        sh '''
                            set +x
                            echo "$DOCKER_PASSWORD" | docker login --username "$DOCKER_USERNAME" --password-stdin
                            docker push "$IMAGE_NAME:$IMAGE_TAG"
                        '''
                    }
            }
        }

        stage('Helm Validate'){
            steps {
                sh '''
                    helm lint ./product-catalogue-chart \
                    --values ./product-catalogue-chart/values-dev.yaml
                '''
            }
        }

        stage('Helm Deploy'){
            steps {
                withCredentials(
                    [
                        string(
                            credentialsId: 'kubernetes-dev-token',
                            variable: 'K8S_TOKEN'
                        )
                    ]
                ) {
                        sh '''
                        set +x

                        helm upgrade --install catalogue-dev \
                        ./product-catalogue-chart \
                        --namespace dev \
                        --values ./product-catalogue-chart/values-dev.yaml \
                        --set image.repository="$IMAGE_NAME" \
                        --set image.tag="$IMAGE_TAG" \
                        --kube-apiserver=https://kubernetes.docker.internal:6443 \
                        --kube-ca-file=/var/jenkins_home/docker-desktop-ca.crt \
                        --kube-token="$K8S_TOKEN" \
                        --wait \
                        --timeout 10m
                    '''
                }
            }
        }
    }
}
pipeline {

    agent any

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
                sh 'docker build -t product-catalogue-service:1.0.0 .'
            }
        }

        stage('Docker Tag'){
            steps {
                sh 'docker tag product-catalogue-service:1.0.0 giridhar8888/product-catalogue-service:1.0.0'
            }
        }

        stage('Docker Login'){
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
                            echo "$DOCKER_PASSWORD" | docker login --username "$DOCKER_USERNAME" --password-stdin
                        '''
                    }
            }
        }

        stage('Docker Push'){
            steps{
                sh 'docker push giridhar8888/product-catalogue-service:1.0.0'
            }
        }

        stage('Deploy to Kubernetes'){
            steps {

                withCredentials([
                    string(
                        credentialsId: 'kubernetes-dev-token',
                        variable: 'K8S_TOKEN'
                    )
                ]) {
                    sh '''
                        set +x

                        kubectl \
                          --server=https://kubernetes.docker.internal:6443 \
                          --certificate-authority=/var/jenkins_home/docker-desktop-ca.crt \
                          --token="$K8S_TOKEN" \
                          --namespace=dev \
                          apply -f deployment.yml

                        kubectl \
                          --server=https://kubernetes.docker.internal:6443 \
                          --certificate-authority=/var/jenkins_home/docker-desktop-ca.crt \
                          --token="$K8S_TOKEN" \
                          --namespace=dev \
                          apply -f service.yml

                        kubectl \
                          --server=https://kubernetes.docker.internal:6443 \
                          --certificate-authority=/var/jenkins_home/docker-desktop-ca.crt \
                          --token="$K8S_TOKEN" \
                          --namespace=dev \
                          rollout status deployment/product-catalogue \
                          --timeout=120s
                    '''
                }
                
            }
        }
    }
}
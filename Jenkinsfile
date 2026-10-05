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
                sh 'docker tag product-catalogue-service giridhar8888/product-catalogue-service:1.0.0'
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
    }
}
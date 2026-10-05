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
    }
}
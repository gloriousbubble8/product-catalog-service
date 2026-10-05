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
    }
}
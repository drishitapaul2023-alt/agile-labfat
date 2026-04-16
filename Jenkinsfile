pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/drishitapaul2023-alt/agile-labfat.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t drishitapaul2026/inheritance-app .'
            }
        }

        stage('Docker Push') {
            steps {
                bat 'docker push drishitapaul2026/inheritance-app'
            }
        }
    }
}
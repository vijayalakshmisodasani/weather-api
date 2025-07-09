pipeline {
    agent any

    tools {
        maven 'maven3'
    }

    environment {
        IMAGE_NAME = 'weather-api'
    }

    stages {
        stage('Clone') {
            steps {
                git 'git@github.com:vijayalakshmisodasani/weather-api.git '
            }
        }

        stage('Build with Maven') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t $IMAGE_NAME .'
            }
        }

        stage('Run Docker Container') {
            steps {
                sh 'docker rm -f weather-container || true'
                sh 'docker run -d --name weather-container -p 8081:8080 $IMAGE_NAME'
            }
        }
    }
}

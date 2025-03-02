pipeline {
    agent any

    environment {
        DOCKER_IMAGE = "your-docker-image-name"
        DOCKER_REGISTRY = "your-docker-registry"
        KUBERNETES_NAMESPACE = "your-kubernetes-namespace"
        KUBERNETES_DEPLOYMENT = "your-kubernetes-deployment"
    }

    stages {
        stage('Checkout from Git') {
            steps {
                git 'https://github.com/prkrishna2091/sample-app-h2-inmemory-db.git'
            }
        }

        stage('Maven Clean Package') {
            steps {
                script {
                    sh 'mvn clean deploy'
                }
            }
        }

        stage('Get Jar from Nexus') {
            steps {
                script {
                    sh 'curl -u your-nexus-username:your-nexus-password -O http://your-nexus-repo-url/repository/your-repo/sample-app-h2-inmemory-db-0.0.1-SNAPSHOT.jar'
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    sh 'docker build -t ${DOCKER_REGISTRY}/${DOCKER_IMAGE}:latest .'
                }
            }
        }

        stage('Push Docker Image') {
            steps {
                script {
                    sh 'docker push ${DOCKER_REGISTRY}/${DOCKER_IMAGE}:latest'
                }
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                script {
                    sh 'kubectl set image deployment/${KUBERNETES_DEPLOYMENT} ${KUBERNETES_DEPLOYMENT}=${DOCKER_REGISTRY}/${DOCKER_IMAGE}:latest -n ${KUBERNETES_NAMESPACE}'
                }
            }
        }
    }
}
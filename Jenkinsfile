pipeline {
    agent {label 'jenkins_task'}
    stages {
        stage('git repo & clean') {
            steps {
                sh "mkdir  Task"
                sh "git clone https://github.com/Sonunarra999/Task"
                sh "mvn clean -f Task"
            }
        }
        stage('Build') {
            steps {
                sh "mvn install -f Task"
            }
        }
        stage('test') {
            steps {
                sh "mvn test -f Task"
            }
        }
        stage('package') {
            steps {
                sh "mvn package -f Task"
            }
        }
    }
}

pipeline {
  agent any
  stages {
    stage('Run Tests') {
      steps {
        script {
          sh 'make test-all'

          withPythonEnv('/usr/bin/python3.8') {
            sh 'pip install -r requirements.txt'
            sh 'make test'
            sh 'make lint'
          }
          withPythonEnv('/usr/bin/python3.9') {
            sh 'pip install -r requirements.txt'
            sh 'make test'
            sh 'make lint'
          }
        }
      }
    }
  }
}
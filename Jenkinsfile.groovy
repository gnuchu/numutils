pipeline {
  agent any
  stages {
    stage('Run Tests') {
      steps {
        script {
          withPythonEnv('/usr/bin/python3') {
            sh 'pip install -r requirements.txt'
            sh 'make test'
          }
        }
      }
    }
  }
}
pipeline {
  agent any
  stages {
    stage('Test') {
      steps {
        script {
          echo "Hello, World!"
        }
      }
    }
  }
}
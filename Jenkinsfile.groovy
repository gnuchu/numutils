pipeline {
  agent any
  stages {
    steps {
      stage('Test') {
        script {
          echo "Hello, World!"
        }
      }
    }
  }
}
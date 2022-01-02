pipeline {
  agent any
  stages {
    stage('Run Tests') {
      steps {
        script {
          sh 'make test'
        }
      }
    }
  }
}
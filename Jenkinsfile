pipeline {
  agent any
  stages {
    stage('Pull') {
      agent any
      steps {
        git(url: 'https://github.com/mayureshkrishna/sb-camel-ms-docker-os/', branch: 'master')
      }
    }
    stage('Build') {
      steps {
        tool(name: 'Maven', type: 'Build Tool')
        sh 'mvn clean package'
      }
    }
  }
}
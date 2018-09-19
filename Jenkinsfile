pipeline {
  agent any
  stages {
    stage('Pull') {
      steps {
        git(url: 'https://github.com/mayureshkrishna/sb-camel-ms-docker-os/', branch: 'master', poll: true)
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
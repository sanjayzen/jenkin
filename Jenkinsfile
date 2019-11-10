pipeline {
    agent any
    stages {
        stage('Compile Project') {
			steps { 
				bat 'mvn -f devops/pom.xml clean install'
			}
        }
    }
}

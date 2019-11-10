pipeline {
    agent any
    stages {
        stage('Compile Project') {
			steps { 
				bat 'cd devops'
				bat 'mvn clean install'
			}
        }
    }
}

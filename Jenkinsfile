pipeline {
    agent any
    stages {
        stage('Compile Project') {
			steps { 
				bat 'mvn clean install'
			}
        }
    }
}

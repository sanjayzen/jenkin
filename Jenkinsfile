pipeline {
    agent any
    stages {
        stage('Compile Project') {
			steps { 
				withMaven(maven: 'Maven') {
					bat 'mvn clean install'
				}
			}
        }
    }
}

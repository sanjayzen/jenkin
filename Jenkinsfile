pipeline {
    agent any
    stages {
        stage('Compile Project') {
			steps { 
				bat 'cd devops'
				bat '/devops/mvn clean install'
			}
        }
    }
}

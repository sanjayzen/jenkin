pipeline {
    agent any
    environment {
        //Use Pipeline Utility Steps plugin to read information from pom.xml into env variables
        IMAGE = readMavenPom().getArtifactId()
        VERSION = readMavenPom().getVersion()
    }
    stages {
        stage('Compile Project') {
			steps { 
				echo "${VERSION}"
				bat 'mvn -f devops/pom.xml clean install'
			}
        }
    }
}

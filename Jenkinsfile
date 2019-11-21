pipeline {
    agent any
    environment {
        //Use Pipeline Utility Steps plugin to read information from pom.xml into env variables
	def pom = readMavenPom file: "devops/pom.xml"
        IMAGE = pom.getArtifactId()
        VERSION = pom.getVersion()
    }
    stages {
        stage('Compile Project') {
			steps { 
				echo "${VERSION}"
				bat 'mvn -f devops/pom.xml clean install'
			}
        }
	stage('Stage 2') {
            steps {
                echo 'Will kick off another job!' 
		    build job: 'fct-pipeline', wait: false, properties([[$class: 'GitlabLogoProperty', repositoryName: ''], parameters([text(defaultValue: '1.1.1', description: '', name: 'ReportVersion'), text(defaultValue: '2.2.2', description: '', name: 'ServerVersion')])])
            }
        }
    }
}

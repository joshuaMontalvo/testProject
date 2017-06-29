#!/usr/bin/env groovy

node {
   
	stage('Build') {
		echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"		

		
echo 'Validating JDK...'
		bat 'echo %PATH%'
		bat 'javac -version'

		echo 'Building...'
		bat 'javac C:/testProject/HelloWorld.java'

	}
	stage('\u2622 Deploy')
 {  

		echo 'Deploying...'
		bat 'java -classpath C:/testProject HelloWorld'
		echo 'Ill be so happy once I see this...'

	
	}
	stage('Archive') {

		echo 'Archiving Artifacts...'
		when {
			expression {
				currentBuild.result == null || currentBuild.result == 'SUCCESS'
				}
		}
		steps {
			nexusArtifactUploader {
				artifacts: {
					{
					artifactId: 'HelloWorld', 
					classifier: 'debug', 
					file: 'HelloWorld.jar', 
					type: 'jar'
					}
				}, 
				credentialsId: 'nexusAdmin', 
				groupId: 'pipelineTest', 
				nexusUrl: 'localhost:8081/nexus', 
				nexusVersion: 'nexus2', 
				protocol: 'http', 
				repository: 'Test Repository', 
				version: '2.14.4-03'
			}
		}			

	}
}

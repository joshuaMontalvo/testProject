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
		archiveArtifacts 'HelloWorld.jar'			

	}
}

#!/usr/bin/env groovy

node {
   
	stage('Build') {
		
echo 'Validating JDK...'
		bat 'echo %PATH%'
		bat 'javac -version'

		echo 'Building...'
		bat 'javac C:/testProject/HelloWorld.java'
	}
	stage('\u2622 Deploy')
 {  
		echo 'Validating CLASSPATH'
		bat '''
			echo %PATH%
			echo %CLASSPATH%
		'''
		echo 'Deploying...'
		bat 'java -classpath C:/testProject HelloWorld'
		echo 'Ill be so happy once I see this...'
	
	}
}

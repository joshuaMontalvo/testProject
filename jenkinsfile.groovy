#!/usr/bin/env groovy

node {

	def vars = [projectName:'Test Pipeline',
		projectType:'JDK']	

 	stage('Build') {
  
 
 		echo "Using ${vars.projectType}"
  		bat 'javac C:/testProject/HelloWorld.java'
  
  	}
  
  	stage('Deploy') {
  
 		echo "Deploying ${vars.projectName}..."
  		bat 'java -classpath C:/testProject HelloWorld'
  
  	}

}
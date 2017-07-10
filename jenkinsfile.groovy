#!/usr/bin/env groovy

pipeline {

	agent any

	environment {
		
		vars = [projectName:'Test Pipeline',
			projectType:'JDK']
	
	}

	stages {

		stage('Build') {
			steps {
				echo 'Building...'
				echo "Using ${vars.projectType}"
				bat 'javac C:/testProject/HelloWorld.java'
			}
		}

		stage('Deploy') {
			steps {
				echo "Deploying ${vars.projectName}..."
				bat 'java -classpath C:/testProject HelloWorld'
			}
		}
	
	}

}
#!/usr/bin/env groovy

pipeline {

	agent any

	environment {
		
		def vars = [projectName:'Test Pipeline',
			projectType:'JDK']
	
	}

	stages {

		stage('Build') {

			echo 'Building...'
			echo "Using ${vars.projectType}"
			bat 'javac C:/testProject/HelloWorld.java'

		}

		stage('Deploy') {

			echo "Deploying ${vars.projectName}..."
			bat 'java -classpath C:/testProject HelloWorld'

		}
	
	}

}
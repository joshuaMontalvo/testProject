#!/usr/bin/env groovy

def vars = [projectName:'Test Pipeline',
	projectType:'JDK']

node {

	stage('Build') {

		echo 'Building...'
		echo "Using ${projectType}"
		bat 'javac C:/testProject/HelloWorld.java'

	}

	stage('Deploy') {

		echo "Deploying ${projectName}..."
		bat 'java -classpath C:/testProject HelloWorld'

	}

}
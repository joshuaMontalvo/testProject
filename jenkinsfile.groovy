#!/usr/bin/env groovy

node {

	stage('Build') {

		echo 'Building...'
		bat 'javac C:/testProject/HelloWorld.java'

	}

	stage('Deploy') {

		echo 'Deploying...'
		bat 'java -classpath C:/testProject HelloWorld'

	}

}
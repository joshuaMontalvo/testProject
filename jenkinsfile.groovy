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

	stage('Archive') {

		echo 'Archiving Artifacts...'
		
		nexusArtifactUploader

			artifacts: {
				[
				artifactId: 'HelloWorld',
				classifier: '',
				file: 'HelloWorld.jar',
				type: 'jar'
				]
			}
			credentialsId: 'nexusAdmin'
			groupId: 'pipelineTest'
			nexusUrl: 'localhost:8081/nexus'
			nexusVersion: 'nexus2'
			protocol: 'http'
			repository: 'Test Repository'
			version: '2.14.4-03'
		

	}

}
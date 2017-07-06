This is a readme.txt. This is a change in readme.

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
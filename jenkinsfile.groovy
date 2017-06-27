node {
   
	stage 'Build'
	
echo 'Building...'

	checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '5f30d748-1b60-4c81-bf04-3bab224975ba', url: 'https://github.com/joshuaMontalvo/testProject.git']]])
	bat 'javac HelloWorld.java'
	archiveArtifacts artifacts: 'C:\Program Files (x86)\Jenkins\workspace\${jar.dir}\HelloWorld.jar, fingerprint: true
   
	stage 'Deploy'
   
		when {
       
			expession {
           
				currentBuild.result == null || currentBuild.result == 'SUCCESS'
       
				}
   
		}
   
	bat 'java HelloWorld'

}
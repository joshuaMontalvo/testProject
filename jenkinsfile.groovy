node {
   
	stage 'Build'
	
echo 'Building...'

	bat 'javac HelloWorld.java'
	archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
   
	stage 'Deploy'
   
		when {
       
			expession {
           
				currentBuild.result == null || currentBuild.result == 'SUCCESS'
       
				}
   
		}
   
	bat 'java HelloWorld'

}
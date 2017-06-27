node {
   
	stage 'Build'
	
echo 'Building...'

	sh 'make'
	archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
   
	stage 'Deploy'
   
		when {
       
			expession {
           
				currentBuild.result == null || currentBuild.result == 'SUCCESS'
       
				}
   
		}
   
	sh 'make publish'

}
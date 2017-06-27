pipeline {
	agent any
		node {
   
			stage 'Build'
			
echo 'Building...'

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
}
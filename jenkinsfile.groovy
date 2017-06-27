node {
   
	stage('Build') {
		
echo 'Building...'

		bat 'cd C:\Users\joshua.montalvo\OneDrive - Accenture\Documents\testProject'
		bat 'javac HelloWorld.java'
	}
	stage('Deploy')
 {  
		echo 'Deploying...'
		bat 'java HelloWorld'
		echo 'I'll be so happy once I see this...'
	
	}
}

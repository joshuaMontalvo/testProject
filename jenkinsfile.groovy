node {
   
	stage('Build') {
		
echo 'Building...'

		bat 'javac HelloWorld.java'
	}
	stage('Deploy')
 {  
		echo 'Deploying...'
		bat 'java HelloWorld'
		echo 'I'll be so happy once I see this...'
	
	}
}

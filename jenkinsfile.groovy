node {
   
	stage('Build') {
		
echo 'Validating JDK...'
		echo %PATH%
		bat 'javac -version'

		echo 'Building...'
		bat 'javac HelloWorld.java'
	}
	stage('Deploy')
 {  
		echo 'Deploying...'
		bat 'java HelloWorld'
		echo 'Ill be so happy once I see this...'
	
	}
}

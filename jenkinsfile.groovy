node {
   
	stage('Build') {
		
echo 'Validating JDK...'
		bat 'echo %PATH%'
		bat 'javac -version'

		echo 'Building...'
		bat 'javac C:/testProject/HelloWorld.java'
	}
	stage('Deploy')
 {  
		echo 'Deploying...'
		bat 'java C:/testProject/HelloWorld'
		echo 'Ill be so happy once I see this...'
	
	}
}

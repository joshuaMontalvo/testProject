node {
   
	stage('Build') {
		
echo 'Validating JDK...'
		echo 'Path is %PATH%'
		echo 'JAVA_HOME is %JAVA_HOME%'
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

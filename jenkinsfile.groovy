node {
   
	stage('Build') {
		
echo 'Building...'

		bat 'cd C:\Users\joshua.montalvo\OneDrive - Accenture\Documents\testProject'
		bat 'javac HelloWorld.java'
	}
	stage('Deploy')
 {  
		bat 'java HelloWorld'

	}
}

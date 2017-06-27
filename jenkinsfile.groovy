node {
   
	stage('Build') {
		
echo 'Building...'

		bat 'set path=C:\Program Files (x86)\Java\jdk1.8.0_131\bin'
		bat 'javac HelloWorld.java'
	}
	stage('Deploy')
 {  
		echo 'Deploying...'
		bat 'java HelloWorld'
		echo 'Ill be so happy once I see this...'
	
	}
}

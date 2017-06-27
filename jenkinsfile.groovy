node {
   
	stage 'Build'
	
echo 'Building...'

	bat 'javac HelloWorld.java'
	stage 'Deploy'
   
	bat 'java HelloWorld'

}

def buildJar() {
  echo "building the application..."
  sh 'mvn package'
}

def buildImage() {
  echo "building the docker image.." 
	withCredentials([usernamePassword(credentialsId: 'docker-hub', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
	sh 'docker build -t fatemehpourghaemi82/my-repo:jma-2.0 .'
	sh "echo $PASS | docker login -u $USER --password-stdin"
	sh 'docker push fatemehpourghaemi82/my-repo:jma-2.0'
	}
}

def deployApp() {
  echo "Deploying the application..."
}

return this 

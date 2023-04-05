def buildApp() {
  echo "building the app"
}

def testApp() {
  echo "Testing the application..." 
}

def deploy App() {
  echo "Deploying the application..."
  echo "deploying version ${params.VERSION}" 
}

return this 

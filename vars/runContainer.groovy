def call(){
    sh "docker run -d --name sonar -p 3000:3000 meryembarkallah21/youtube:latest"
}

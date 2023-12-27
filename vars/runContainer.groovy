def call(){
    sh "docker run -d --name sonar -p 4000:3000 meryembarkallah21/youtube:latest"
}

def call(){
    sh 'docker stop sonar'
    sh 'docker rm sonar'
}

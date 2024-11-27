pipeline{
    @anyagent
    stages{
        stage("build")
        {
            script{                
            build 'docker build -t node-app'
            }
        }
        stage("test"){
        script
        {
            echo 'testing'
        }
        }
        stage("deploy")
        {
            script{
            echo 'depolying'
            }
        }
    }
}
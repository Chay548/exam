pipeline{
    anyagent
    stages{
        stage('build')
        {
            build 'docker -t node-app'
        }
        stage('test')
        {
            echo 'testing'
        }
        stage('deploy')
        {
            echo 'depolying'
        }
    }
}
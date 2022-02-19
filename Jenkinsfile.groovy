properties([
    buildDiscarder(logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '', numToKeepStr: '10')), 
    pipelineTriggers([cron('* * * * *')])])



node {
    
    stage('Preparation') {
        timestamps {
            echo "Hello World"
        }
    }
    stage('Build') {
    }
    stage('Results') {
    }
}

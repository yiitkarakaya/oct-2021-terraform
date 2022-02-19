properties([
    parameters([string(defaultValue: 'dev', description: 'Please provide the environment to build', name: 'ENVIR')]), 
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

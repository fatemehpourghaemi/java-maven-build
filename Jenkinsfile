#!/usr/bin/env groovy

pipeline {
    agent any
    parameters {
        booleanParam(name: 'execteTests', defaultValue: true, description: '')
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
    }
    stages {
        stage("build") {
            steps {
                echo 'building the application...'
            }
        }
        stage('test') {
            
            when {
                expression{
                    params.executeTests
                }
            steps {
                script {
                    echo "Testing the application..."
                }
            }
        }
        stage('deploy') {
            steps {
                echo "Deploying the application..."
                echo "deploying version ${params.VERSION}"
            }
        }
    }
}

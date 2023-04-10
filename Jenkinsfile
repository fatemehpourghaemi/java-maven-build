#!/usr/bin/env groovy

@Library('Jenkins-Shared-Library')
def gv

pipeline {
	agent any
	tools {
		maven 'Maven'
	}
	stages {
		stage("init") {
			steps {
				script {
					gv = load "script.groovy"
				}
			}
		}
		stage("build jar") {
			steps {
				script {
					buildJar()
				}
			}
		}
		stage("build image") {
			steps {
				script {
					buildImage("fatemehpourghaemi82/my-repo:jma-2.1")
				}
			}
		}
		stage("deploy") {
        			steps {
        				script {
        					gv.deployApp()
        				}
        			}
        		}
	}

}

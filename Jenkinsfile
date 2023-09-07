pipeline {

    options {
        buildDiscarder(logRotator(numToKeepStr: '5', artifactNumToKeepStr: '5'))
        }

	agent any
	tools {
		maven 'maven_3.8.8'
	}
	stages {
		stage('code compilation') {
			steps {
				echo 'code compilation is starting'
				sh 'mvn clean compile'
				echo 'code compilation is completed'
			}
		}

		stage('Code Test') {
			steps {
				echo 'code testing is starting'
				sh 'mvn clean test'
				echo 'maven testing is done'
			}
		}

		stage('Code Packages') {
			steps {
				echo 'Code packing is starting'
				sh 'mvn clean package'
				echo 'code packing is done'
			}
		}
	}
}
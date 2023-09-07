pipeline {
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
		stage('Code RUN') {
        			steps {
        				echo 'Code Running'
        				sh 'mvn spring-boot:run'
        				echo 'code packing is done'
        			}
        		}
	}
}
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    // Clean and build the Maven project
                    sh 'mvn clean install'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    // Run Cucumber tests using Maven
                    sh 'mvn test'
                }
            }
        }

        stage('Archive') {
            steps {
                script {
                    // Archive the artifacts (e.g., JAR files, reports)
                    archiveArtifacts 'target/*.jar', 'target/cucumber-reports/**'
                }
            }
        }
    }

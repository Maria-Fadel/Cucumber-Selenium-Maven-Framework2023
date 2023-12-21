pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                script {
                    // Run Cucumber tests using Maven
                    bat 'mvn clean test'
                }

                // Add cucumber step to publish reports
                cucumber buildStatus: 'UNSTABLE', fileIncludePattern: 'target/cucumber-reports/*.json'
            }
        }

        stage('Archive') {
            steps {
                script {
                    // Archive the artifacts (e.g., JAR files, reports)
                    archiveArtifacts 'target/cucumber-reports/**'
                }
            }
        }
    }
}

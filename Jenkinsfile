pipeline {
    agent any

    stages {
        stage('Run Tests') {
            steps {
                echo 'Building the project'
                sh 'mvn clean test'
                // Add your build commands here
            }
        }

    }
}

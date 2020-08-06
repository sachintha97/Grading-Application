# Grading-Application
A Web Application to help students and teachers to view assignments details, results, review answers, overall grade and etc.

# Development Guide
## Prerequisites
- git
- npm
- java

Download the zip or clone the Git repository

### Backend Running Steps

- Open application-be project using IntelliJ IDEA
- Refresh all gradle projects (install dependecies)
- Run ApplicationBeApplication main java class (@SpringBootApplication class)

OR 

- Open Command Prompt and change directory to application-be folder
- Gradle build using gradlew build -x test
- Run : java -jar build/libs/application-be-0.0.1-SNAPSHOT.jar

### Frontend Running Steps
- Open Command Prompt and change directory to grading-application-fe folder
- Install dependencies using npm install
- Run : npm start

Create a database with name "grading_application_db" and add some dummy values,
to deploy application in localhost

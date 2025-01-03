FROM openjdk:21-jdk-slim

COPY ./build/libs/ci-cd-java-project-1.0.0.jar /usr/app/
WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "ci-cd-java-project-1.0.0.jar"]
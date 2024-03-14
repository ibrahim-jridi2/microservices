FROM openjdk:17-jdk-slim
EXPOSE 8081

ADD target/*.jar job.jar
ENTRYPOINT ["java","-jar","job.jar"]

FROM openjdk:17-jdk-slim
EXPOSE 8088
ADD target/*.jar Candidate.jar
ENTRYPOINT ["java","-jar","Candidate.jar"]

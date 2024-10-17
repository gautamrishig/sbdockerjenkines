FROM openjdk:17-jdk-alpine
EXPOSE 8080
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} sbdockerjenkines.jar
ADD target/springBootDocker.jar springBootDocker.jar 
ENTRYPOINT ["java","-jar","/sbdockerjenkines.jar"]

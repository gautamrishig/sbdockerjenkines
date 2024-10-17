FROM openjdk:17-jdk-alpine
EXPOSE 8080
ADD target/sbdockerjenkines.jar sbdockerjenkines.jar
ENTRYPOINT ["java","-jar","sbdockerjenkines.jar"]


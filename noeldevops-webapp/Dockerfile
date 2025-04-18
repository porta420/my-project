FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/noeldevops.jar /app/noeldevops.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "noeldevops.jar"]

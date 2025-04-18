# Start from official Maven image to build the app
FROM maven:3.9.4-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Use lighter JRE image to run the app
FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/target/noeldevops-webapp-1.0.0.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

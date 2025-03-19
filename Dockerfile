# Use the official OpenJDK 21 image
FROM openjdk:21-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/portfolio-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port (Replace 9090 with your actual port if different)
EXPOSE 9090

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]

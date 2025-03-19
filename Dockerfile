
# Use the official OpenJDK 21 image
FROM openjdk:21-jdk-slim

ARG PORT
ARG DB_URL
ARG DB_DATABASE
ARG DB_INDEX
ARG SMTP_HOST_MAIL
ARG SMTP_PORT
ARG SMTP_MAIL
ARG SMTP_PASSWORD
ARG SMTP_AUTH
ARG SMTP_ENABLE

ENV PORT=${PORT}
ENV DB_URL=${DB_URL}
ENV DB_DATABASE=${DB_DATABASE}
ENV DB_INDEX=${DB_INDEX}
ENV SMTP_HOST_MAIL=${SMTP_HOST_MAIL}
ENV SMTP_PORT=${SMTP_PORT}
ENV SMTP_MAIL=${SMTP_MAIL}
ENV SMTP_PASSWORD=${SMTP_PASSWORD}
ENV SMTP_AUTH=${SMTP_AUTH}
ENV SMTP_ENABLE=${SMTP_ENABLE}

# Set the working directory in the container
WORKDIR /app

# Copy the .env file into the container (Make sure .env is in the same directory as your Dockerfile)
#COPY .env /app/.env

# Copy the JAR file into the container
COPY target/portfolio-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port
EXPOSE 9090

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]

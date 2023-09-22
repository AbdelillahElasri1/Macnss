# Use a base image with Java pre-installed
FROM openjdk:11-jre-slim

# Set the working directory
WORKDIR /app

# Copy the Java application JAR file to the container
COPY your-app.jar /app

# Specify the command to run your Java application
CMD ["java", "-jar", "your-app.jar"]

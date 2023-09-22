# Use a base image with Java pre-installed
FROM adoptopenjdk:20-jre-hostpot

# Set the working directory
WORKDIR /app

# Copy the Java application JAR file to the container
COPY Macnss-1.0-SNAPSHOT.jar /app

# Specify the command to run your Java application
CMD ["java", "-jar", "Macnss-1.0-SNAPSHOT.jar"]

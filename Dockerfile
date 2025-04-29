# Use the OpenJDK image to run the app
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the JAR file into the container
COPY target/OrangeSkyTours.jar /app/OrangeSkyTours.jar

# Run the application
CMD ["java", "-jar", "OrangeSkyTours.jar"]

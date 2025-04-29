# Use an official Maven image to build the app
FROM maven:3.8.1-openjdk-17 AS build

# Set the working directory
WORKDIR /app

# Copy pom.xml and source code into the container
COPY ./pom.xml /app/pom.xml
COPY ./src/main /app/src/main

# Run Maven to build the application
RUN mvn clean package -DskipTests

# Use an official OpenJDK image to run the app
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the JAR file from the build stage
COPY --from=build /app/target/*.jar /app/app.jar

# Run the application
CMD ["java", "-jar", "app.jar"]

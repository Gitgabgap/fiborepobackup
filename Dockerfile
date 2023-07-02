# Use the official Maven image as the build environment
FROM maven:3.8.1-openjdk-17-slim AS build
WORKDIR /app

# Copy the Maven Wrapper files
COPY .mvn .mvn
COPY mvnw mvnw

# Copy the Maven project files
COPY pom.xml .
COPY src ./src

# Build the application using the Maven Wrapper
RUN mvn clean package -DskipTests

# Use OpenJDK as the base image for the runtime environment
FROM openjdk:17-jdk

# Set the working directory
WORKDIR /app

# Copy the JAR file from the build environment
COPY --from=build /app/target/fibodemo-0.0.1-SNAPSHOT.jar ./app.jar

# Expose the port that your application listens on
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]

# Start with a base image containing Java runtime
FROM openjdk:11-jdk-slim as build

# Add Author info
LABEL maintainer="yourname@example.com"

# Set the working directory in Docker
WORKDIR /app

# Copy the Maven Wrapper and pom.xml file
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .

# Copy your source code
COPY src src

# Make the Maven Wrapper script executable
RUN chmod +x ./mvnw

# Build the application
RUN ./mvnw clean package -DskipTests

# Run stage
FROM openjdk:11-jre-slim
COPY --from=build /app/target/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]

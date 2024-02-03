# Start with a base image containing Java runtime
FROM openjdk:11-jdk-slim as build

# Set the working directory in Docker
WORKDIR /app

# Copy the pom.xml file
COPY pom.xml .

# Copy your source code
COPY src src

# Build the application
RUN mvn clean package -DskipTests

# Run stage
FROM openjdk:11-jre-slim
COPY --from=build /app/target/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]

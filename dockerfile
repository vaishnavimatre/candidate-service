FROM openjdk:24-jdk-slim
WORKDIR /app

# Copy Jar from build context to /app directory in the image
COPY target/candidate_service-0.0.1-SNAPSHOT.jar candidate_service-0.0.1-SNAPSHOT.jar

# Set the entry point
ENTRYPOINT ["sh", "-c", "java -jar /app/candidate_service-0.0.1-SNAPSHOT.jar"]

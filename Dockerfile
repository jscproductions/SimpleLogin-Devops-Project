# Use a base image with Java (choose the appropriate version)
FROM openjdk:17-oracle

# Set the working directory inside the container
WORKDIR /app

# Copy the Spring Boot application JAR file into the container
COPY target/myproject-0.0.1-SNAPSHOT.war myproject.war

# Expose the port your Spring Boot application listens on (usually 8080)
EXPOSE 8080

# Define environment variables (if needed)
# ENV DATABASE_URL=your_database_url
# ENV DATABASE_USERNAME=your_database_username
# ENV DATABASE_PASSWORD=your_database_password

# Command to run the Spring Boot application when the container starts
CMD ["java", "-jar", "myproject.war"]

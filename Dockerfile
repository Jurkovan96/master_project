FROM openjdk:17
WORKDIR /app
COPY config_module/target/config_module-0.0.1-SNAPSHOT.jar .
ADD config_module/target/config_module-0.0.1-SNAPSHOT.jar config_module-0.0.1-SNAPSHOT.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "config_module-0.0.1-SNAPSHOT.jar"]

# DropwizardProject
Requirements:
1. Java SDK 8
2. Maven

How to start the DropwizardProject application
---

1. Run `mvn clean install` to build your application
2. Start application with `java -jar target/simple-dropwizard-1.0-SNAPSHOT.jar server config.yml`
3. To check that your application is running enter url `http://localhost:8080`
4. Goto `http://localhost:8080/swagger` for Swagger UI

Health Check
---

To see your applications health enter url `http://localhost:8081/healthcheck`

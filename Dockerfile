FROM openjdk:17-oracle
EXPOSE 8080
COPY target/product-service-1.0-SNAPSHOT.jar product-service.jar
ENTRYPOINT ["java", "-jar", "product-service.jar"]
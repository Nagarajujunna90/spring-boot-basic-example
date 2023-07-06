FROM openjdk:8
EXPOSE 9090
ADD target/spring-boot-basic-example-0.0.1-SNAPSHOT.jar spring-boot-example
ENTRYPOINT ["java", "-jar","spring-boot-example"]
FROM azul/zulu-openjdk-alpine:17.0.4.1-17.36.17

COPY build/libs/helloworld-0.0.1-SNAPSHOT.jar .
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "helloworld-0.0.1-SNAPSHOT.jar"]
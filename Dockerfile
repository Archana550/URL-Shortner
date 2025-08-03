FROM openjdk:17
COPY target/url-shortener.jar url-shortener.jar
ENTRYPOINT ["java", "-jar", "url-shortener.jar"]

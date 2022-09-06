FROM openjdk:8-jre-slim
VOLUME /tmp
EXPOSE 8011
ARG JAR_FILE=target/middleware-consults-iptv-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} middleware-consults-iptv.jar
ENTRYPOINT ["java","-jar","middleware-consults-iptv.jar"]
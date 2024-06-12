FROM openjdk:15
MAINTAINER Basicstarter
ARG JAR_FILE
COPY target/${JAR_FILE} ./app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "app.jar"]

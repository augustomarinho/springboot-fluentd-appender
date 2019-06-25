FROM openjdk:8u212-jdk-slim-stretch

#PORT FORWARD
EXPOSE 8080

#INSTALLING APP
RUN mkdir config
VOLUME /tmp
ADD springboot-fluentd-appender-1.0-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
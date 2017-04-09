FROM ubuntu:16.04

# Installing Java 8 (Oracle)
RUN apt-get update
RUN DEBIAN_FRONTEND=noninteractive apt-get -y install software-properties-common
RUN DEBIAN_FRONTEND=noninteractive apt-get dist-upgrade -y
RUN DEBIAN_FRONTEND=noninteractive add-apt-repository ppa:webupd8team/java -y
RUN DEBIAN_FRONTEND=noninteractive apt-get update -y
RUN echo debconf shared/accepted-oracle-license-v1-1 select true | debconf-set-selections  && \
    echo debconf shared/accepted-oracle-license-v1-1 seen true | debconf-set-selections  && \
	apt-get -qqy install oracle-java8-installer

#PORT FORWARD
EXPOSE 8080

#INSTALLING APP
VOLUME /tmp
ADD springboot-fluentd-appender-1.0-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
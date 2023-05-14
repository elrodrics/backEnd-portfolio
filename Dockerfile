FROM amazoncorretto:17-alpine-jdk
MAINTAINER molinarodrigo
COPY target/molinarodrigo-0.0.1-SNAPSHOT.jar molinarodrigo-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/molinarodrigo-0.0.1-SNAPSHOT.jar"]
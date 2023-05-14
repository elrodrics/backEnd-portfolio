FROM amazoncorretto:17-alpine-jdk
MAINTAINER molinarodrigo
COPY target/molinarodrigo-0.0.1-SNAPSHOT.jar molinarodrigo-app.jar
ENTRYPOINT ["java","-jar","/molinarodrigo-app.jar"]
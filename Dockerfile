FROM amazoncorretto:20
MAINTAINER molinarodrigo
COPY target/molinarodrigo-0.0.1-SNAPSHOT.jar molinarodrigo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/molinarodrigo-0.0.1-SNAPSHOT.jar"]
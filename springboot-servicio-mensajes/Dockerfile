FROM openjdk:12
VOLUME /tmp
ADD ./target/springboot-servicio-mensajes-0.0.1-SNAPSHOT.jar servicio-mensajes.jar
ENTRYPOINT ["java","-jar","/servicio-mensajes.jar"]
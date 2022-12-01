FROM openjdk:12
VOLUME /tmp
ADD ./target/springboot-servicio-gateway-server-0.0.1-SNAPSHOT.jar servicio-gateway-server.jar
ENTRYPOINT ["java","-jar","/servicio-gateway-server.jar"]
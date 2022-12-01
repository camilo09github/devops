FROM openjdk:12
VOLUME /tmp
ADD ./target/springboot-servicio-usuarios-0.0.1-SNAPSHOT.jar springboot-servicio-usuarios.jar
ENTRYPOINT ["java","-jar","/springboot-servicio-usuarios.jar"]
FROM openjdk:12
VOLUME /tmp
ADD ./target/springboot-servicio-oauth-0.0.1-SNAPSHOT.jar springboot-servicio-oauth.jar
ENTRYPOINT ["java","-jar","/springboot-servicio-oauth.jar"]
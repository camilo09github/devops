FROM openjdk:12
VOLUME /tmp
EXPOSE 8888
COPY ./target/springboot-servicio-commons-0.0.1-SNAPSHOT.jar springboot-servicio-commons.jar
ENTRYPOINT ["java","-jar","/springboot-servicio-commons.jar"]
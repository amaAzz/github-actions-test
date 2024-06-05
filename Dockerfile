

FROM openjdk:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} my_img.jar
ENTRYPOINT ["java","-jar","/my_img.jar"]
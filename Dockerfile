FROM openjdk:22
EXPOSE 7777
ADD target/my_img.jar my_img.jar
ENTRYPOINT ["java","-jar","/my_img.jar"]
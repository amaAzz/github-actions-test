FROM maven:3.8.7-openjdk-22 as builder
WORKDIR /build
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn clean package -DskipTests

FROM amazoncorretto:17
WORKDIR /app
COPY --from=builder /build/target/*.jar /app/
EXPOSE 7777
CMD java -jar snapshot.jar
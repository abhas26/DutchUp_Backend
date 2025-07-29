FROM maven:3.9.11-openjdk-24 AS build

COPY . .

RUN mvn clean package -DskipTests

FROM openjdk:21-jdk-slim

COPY --from=build /target/mentormate-server-0.0.1-SNAPSHOT.jar demo.jar

EXPOSE 8080

ENTRYPOINT [“java”,“-jar”,“demo.jar”]
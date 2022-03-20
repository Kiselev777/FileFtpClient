FROM maven:3-openjdk-11 as build
COPY src /src
COPY pom.xml .
RUN mvn -f /pom.xml clean package

FROM openjdk:11-jre-slim
COPY --from=build /target/FtpClient1-1.0-SNAPSHOT.jar FtpApp.jar
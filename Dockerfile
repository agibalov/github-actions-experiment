FROM openjdk:8-jdk
COPY . /repo
WORKDIR /repo
RUN ./gradlew clean test

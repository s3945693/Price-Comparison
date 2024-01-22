FROM eclipse-temurin:17-jdk-alpine as base

## First build the app
FROM base as builder
WORKDIR /opt/app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN dos2unix ./mvnw
RUN chmod +x ./mvnw  # <-- Set execute permissions here
RUN ./mvnw dependency:go-offline
COPY ./src ./src
RUN ./mvnw clean install

## Now run it
FROM base as runner
WORKDIR /opt/app
EXPOSE 8080
COPY --from=builder /opt/app/target/.jar /opt/app/.jar
ENTRYPOINT ["java", "-jar", "/opt/app/*.jar" ]
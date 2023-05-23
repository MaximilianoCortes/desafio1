FROM maven:3.8.5-openjdk-17-slim AS builder
WORKDIR /build 
COPY . . 
RUN mvn clean package
RUN mv /build/target/*.jar /build/target/desafio1.jar

FROM openjdk:17-slim
EXPOSE 8080 
COPY --from=builder /build/target/desafio1.jar /app/desafio1.jar
CMD ["java","-jar","/app/desafio1.jar"]
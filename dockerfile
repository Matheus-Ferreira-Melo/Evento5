FROM openjdk:latest
WORKDIR salaf
COPY . .
CMD ["java", "pratica1/pratica1.iml"]

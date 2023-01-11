FROM maven:3.8.2-jdk-11

WORKDIR /Bench-Training-Project
COPY . .
RUN mvn install

CMD mvn spring-boot:run
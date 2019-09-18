FROM openjdk:8
COPY ./target/sqltest.jar /usr/app/
WORKDIR /usr/app
RUN sh -c 'touch sqltest.jar'
EXPOSE 8080
CMD ["java", "-jar", "sqltest.jar"]
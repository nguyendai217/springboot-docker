FROM jdk:11
WORKDIR /app
COPY /target/* /app
RUN ["java -jar", ""]
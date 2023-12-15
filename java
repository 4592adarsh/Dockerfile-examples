FROM opnejdk:17-jdk-alpine
WORKDIR /src/usr/app
ARG JAR_FILE=target/*jar
COPY .
EXPOSE 8080 
CMD ["java","-jar","app.jar" ]


application.properties:- 
  server.port=8082

application.yml
 server:  
      port:8082

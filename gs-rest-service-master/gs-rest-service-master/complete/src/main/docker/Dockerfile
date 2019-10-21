FROM complete
VOLUME /tmp
ADD target/gs-rest-service-0.1.0.jar app.jar
ENTRYPOINT ["java","-cp","app:app/lib/*","hello.Application"]
# ENTRYPOINT ["java","-jar","/app.jar"]
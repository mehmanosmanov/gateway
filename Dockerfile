FROM openjdk
WORKDIR /home
COPY build/libs/gateway-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java","-jar","/home/gateway-0.0.1-SNAPSHOT.jar"]
# Docker file - instructions to create the docker image,

FROM openjdk:21

RUN mkdir /usr/app/

COPY target/My_Docker_App.jar /usr/app

WORKDIR /usr/app/

ENTRYPOINT [ "java","-jar","My_Docker_App.jar" ]
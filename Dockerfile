FROM openjdk:11
WORKDIR /app
COPY . /app
RUN javac factorial.java
CMD [ "java","factorial" ]

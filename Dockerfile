FROM adoptopenjdk/openjdk11:alpine-jre
ADD target/Graduation-Project-0.0.1-SNAPSHOT.jar Graduation-Project.jar
ENTRYPOINT ["java", "-jar", "Graduation-Project.jar"]
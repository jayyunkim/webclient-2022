FROM openjdk:11

# Source and Destination
COPY target/jykwebclient2022.jar jykwebclient2022.jar

ENTRYPOINT ["java", "-jar", "jykwebclient2022.jar"]
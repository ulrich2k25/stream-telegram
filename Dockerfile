# Utiliser Java 17
FROM openjdk:17-jdk-slim

# Dossier de travail
WORKDIR /app

# Copier ton jar Maven
COPY target/*.jar app.jar

# Démarrer ton projet
ENTRYPOINT ["java", "-jar", "app.jar"]

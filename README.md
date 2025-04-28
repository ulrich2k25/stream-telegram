# Stream-Telegram

Backend Spring Boot pour un site vitrine de films avec redirection vers Telegram.

## Description
Ce projet est une API REST développée en Java avec Spring Boot.  
Il permet d'afficher des films sous forme de vignettes cliquables, redirigeant directement vers des liens Telegram.

## Fonctionnalités
- Backend Spring Boot (Java 17)
- Connexion à une base de données MySQL (Railway ou autre)
- Gestion des films (titre, image, lien)
- Redirection des utilisateurs vers Telegram
- Configuration de la base de données via `application.properties`

## Technologies utilisées
- Java 17
- Spring Boot
- Maven
- Hibernate (JPA)
- MySQL

## Démarrage rapide

```bash
git clone https://github.com/ulrich2k25/stream-telegram.git
cd stream-telegram
mvn clean install
mvn spring-boot:run

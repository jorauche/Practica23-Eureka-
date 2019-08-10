# Practica23-Eureka-
Practica 23 de microservicio, donde el age-microservice manda a llamar por una peticion rest a random-microservice


### requesitos
* java 8
* Maven


### pasos para su ejecucion

Levantar todos los microservices
Primero server, user, uppercase, random

```
mvn clean package
mvn spring-boot:run

```

### perfiles

Se creo los tres perfiles 


```
local
ribbon-api
load-balanced-rest-template
```

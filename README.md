# Practica23-Eureka-
Practica 23 de microservicio, donde el age-microservice manda a llamar por una peticion rest a random-microservice


### requesitos
* java 8
* Maven


### pasos para su ejecucion

despues de tener ambientado todo, necesitamos levantar de uno en uno los microservicios , como se explica acontinuación

Primero server, que es el servidor Eureka


```
Posicionar en la ruta Practica23-Eureka-\23-Eureka-Server 
Se ejecuta el siguiente comando para compilar
mvn clean package

Posteriormete lo levantamos que va ser por el puerto 9099 , contexto : /my-eureka-server
mvn spring-boot:run

link : http://localhost:9099/my-eureka-server/
```

Despues levantamos el siguiente microservicio que es Practica23-Eureka-\23-Age-Microservice


```
Posicionar en la ruta D:\AMBIENTESTRABAJO\PROYECTOFINALGIT\25-Eureka-Server 
Se ejecuta el siguiente comando para compilar
mvn clean package

Posteriormete lo levantamos que va ser por el puerto 9099 , contexto : /my-eureka-server
mvn spring-boot:run

Cuando se levante se va registrar ese microservicio en el servidor de eureka

```



### perfiles

Se creo los tres perfiles 


```
local
ribbon-api
load-balanced-rest-template
```

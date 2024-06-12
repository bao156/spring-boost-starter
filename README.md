# Spring Boot Basic Starter

Basic Spring Boot Starter Project.

## 1. Technologies used

- [Java 15](https://www.oracle.com/java/technologies/javase/jdk15-archive-downloads.html)
- [Spring Boot 2.6.1](https://spring.io/projects/spring-boot)
- [Docker](https://docs.docker.com/get-docker/)
- [Flyway 8.3.0](https://flywaydb.org/)
- [Postgresql](https://www.postgresql.org/)
- ...

## 2. Infrastructures

All infrastructures are being deployed as docker services. Follow the commands below to start them:

```bash
$ cd ./docker

# dev
$ docker-compose up -d

# staging
$ docker-compose -f ./docker-compose-staging.yml up -d
```

## 3. Development

Building the project is dependent on the environment you want to build for. The default environment is "dev".
- Build: `mvn clean package` or `mvn clean package -DskipTests` if you want to skip unit tests for faster build. However, it's not recommended skipping the tests.
- Running the application: `mvn spring-boot:run` to start spring boot application on embedded server (dev env).

## 4. Deployment

- Install docker at https://docs.docker.com/get-docker/
- From root folder, run:

```bash
$ docker login --username xxx --password xxx

# staging
$ mvn clean install -Pstaging -DskipTests
$ mvn deploy -DskipDocker=false -Pstaging -f derfet-erp-apis/pom.xml
```

- Access to server, run:

```bash
# staging
$ docker stop basicstarter-server
$ sudo docker-compose -f docker-compose-staging.yml pull
$ sudo docker-compose -f docker-compose-staging.yml up -d
```

## 5. Default users

- User: `user/user123`
- Admin: `admin/admin123`

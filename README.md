<h1 align="center">
  Spring Security JWT
</h1>

Tutorial apresentado [nesse vídeo](https://youtu.be/kEJ8a1w4a2Q) para ilustrar como implementar uma autenticação e autorização com Spring Security e JWT.

## Tecnologias
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Security](https://spring.io/projects/spring-security)
- [Spring Data JDBC](https://spring.io/projects/spring-data-jdbc)
- [H2](https://www.h2database.com)

## Como Executar
- Clonar repositório git:
```
git clone https://github.com/todo.git
```

- Construir o projeto:
```
./mvnw clean package
```

- Executar:
```
java -jar ./target/spring-security-jwt-0.0.1-SNAPSHOT.jar
```

- Testar:
```
POST com Basic Auth para http://localhost:8080/authenticate
passando username e password 
GET com JWT token para http://localhost:8080/private 
Bearer = token recebido na autenticação
```
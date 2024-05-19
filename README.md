# Sobre o projeto
O password_validador_api é uma REST API que realiza validação da senha enviada, atendendo os requisitos abaixo:

- Possuir nove ou mais caracteres
- Possuir ao menos 1 dígito
- Possuir ao menos 1 letra minúscula
- Possuir ao menos 1 letra maiúscula
- Possuir ao menos 1 caractere especial dentre: "!@#$%^&*()-+"
- Não possuir caracteres repetidos dentro do conjunto


# Tecnologias utilizadas
- Java
- Spring Boot
- Maven

# Pré-requisitos:
Java 17 ou superior

# Como executar o projeto
```bash
## clonar repositório
git clone https://github.com/wesfrs/password_validador_api.git

## entrar na pasta do projeto
cd password_validador_api

## executar o projeto:
./mvnw spring-boot:run
```

# Rotas
```bash
## POST:
http://localhost:8080/password_validador_api/validate_password

## Body JSON Senha Válida :
{"password": "Ab!cde1fg"}
````
# Autor
Wesley Freire Silva

https://www.linkedin.com/in/wesley-freire-silva/


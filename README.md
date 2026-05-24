8# API de Gerenciamento de Usuários

<img src="https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=OpenJDK&logoColor=white" alt="Java" /> <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=Spring%20Boot&logoColor=white" alt="Spring Boot" /> <img src="https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white" alt="PostgreSQL" /> <img src="https://img.shields.io/badge/AWS-232F3E?style=for-the-badge&logo=amazonaws&logoColor=white" alt="AWS" /> <img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=Docker&logoColor=white" alt="Docker" /> <img src="https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=Gradle&logoColor=white" alt="Gradle" /> <img src="https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=Postman&logoColor=white" alt="Postman" />


- API de Gerenciamento de Usuários

    - Endpoints REST para cadastro, login e atualização de perfis.

    - Uso de DTOs e validações com Bean Validation.

    - Deploy em AWS ou Heroku

 API REST para cadastro, autenticação (login) e atualização de perfis de usuários, desenvolvida seguindo boas práticas de arquitetura, validação de dados e organização de código.

 ## 📌 Funcionalidades

 - Cadastro de usuários
 - Login/autenticação
 - Atualização de perfil
 - Validação de dados com Bean Validation
 - Uso de DTOs para entrada e saída de dados
 - API RESTful

## 🛠️ Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Web
- Spring Validation (Bean Validation)
- Spring Data JPA
- Banco de dados relacional (ex: MySQL/PostgreSQL)
- Maven ou Gradle

## 📂 Estrutura do Projeto

```text

src/main/java
├── controller
├── service
├── repository
├── dto
├── model
└── config

```

## 🔐 Validações

As requisições utilizam DTOs com anotações de validação, como:

- @NotBlank
- @Email
- @Size
- @NotNull

Isso garante integridade dos dados antes do processamento.

## 🚀 Endpoints Principais 

| Método  |	Endpoint |	Descrição |
|---------|----------|------------|
| POST	 | /users/register | Cadastro de usuário |
| POST	 | /users/login | Login do usuário |
| PUT	| /users/{id} |	Atualização de perfil |


---


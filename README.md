# API de Gestão ToDo

Esse projeto é uma API Rest para o gerenciamento de tarefas ToDo, desenvolvido como um projeto de estudo para a construção de APIs com Spring Boot.

---

# Funcionalidades

A API oferece um conjunto completo para operação CRUD para a `Tarefa`:

-  **Listagem de todas as tarefas:** `GET /api/tasks  `
-  **Busca de uma tarefa por ID:** `GET /api/tasks/{id}`
-  **Cadastro de uma nova tarefa:** `POST /api/tasks`
-  **Atualização completa da tarefa:** `PUT /api/tasks{id}`
-  **Deletar uma tarefa:** `DELETE /api/tasks/{id}`
-  **Documentação interativa da API:** Acesso via Swagger UI.

---

# Tecnologias Utilizadas

Este projeto foi construído utilizando as seguintes tecnologias e bibliotecas:

* Java 21
* Spring Boot 3.x
* Spring Web
* Maven
* Springdoc OpenAPI (Swagger UI)
* Lombok

---

# Executar o Projeto

Siga os passos abaixo:

1. Clone o repositório 

git clone https://github.com/GuilhermePT1/Todo-api.git

2. Navegue até a pasta

cd Todo-api

3. Execute a aplicação utilizando Maven.

mvn spring-boot:run

4. De acordo com todo esse passo a passo, a aplicação inicará e estará disponível em `http://localhost:8080`.

Documentação completa e interativa com Swagger UI: http://localhost:8080/swagger-ui.html

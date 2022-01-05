# TESTE DE DESENVOLVIMENTO
![GitHub](https://img.shields.io/github/license/oTalDoHud/ProjetoDashBoardVendas)

# Sobre o projeto

Esse teste prático tem o objetivo de demonstrar conhecimentos técnicos em Java, Spring Boot, JPA, Rest, padrão MVC e banco de dados relacional.

A aplicação consiste na persistência de tarefas, tarefas que por sua vez não poderiam apresentar menos de 10 caracteres ou contar caracteres especiais.
<br/>
<br/>

# Requisições - Postman

Todas as requisições foram feitas com o auxílio da tecnologia Postman, caso as tarefas informadas correspondam as regras de negócio, a aplicação retorna o objeto persistido no formato Json e a resposta 200 (ok). 

Caso contrário a aplicação informa o erro que impediu a persistencia e a resposta 400 (Bad Request).
<br/>
<br/>

# Requisições aceitas:

![req1](https://github.com/oTalDoHud/mandalorian-dev-test/blob/main/Requisições%20testadas/Tasks/Aceitas/ReqAceita%20(1).png) 
<br/>

![req2](https://github.com/oTalDoHud/mandalorian-dev-test/blob/main/Requisições%20testadas/Tasks/Aceitas/ReqAceita%20(2).png) 
<br/>

![req3](https://github.com/oTalDoHud/mandalorian-dev-test/blob/main/Requisições%20testadas/Tasks/Aceitas/ReqAceita%20(3).png)
<br/>
<br/>
<br/>

# Requisições negadas:
## Caracteres especiais:

![reqNegada1](https://github.com/oTalDoHud/mandalorian-dev-test/blob/main/Requisições%20testadas/Tasks/Negadas/CaracterEspecial%20(1).png) 
<br/>

![reqNegada2](https://github.com/oTalDoHud/mandalorian-dev-test/blob/main/Requisições%20testadas/Tasks/Negadas/CaracterEspecial%20(2).png) 
<br/>
<br/>
<br/>


## Requisições com menos de 10 caracteres:

![reqNegada3](https://github.com/oTalDoHud/mandalorian-dev-test/blob/main/Requisições%20testadas/Tasks/Negadas/MenorDe10%20(1).png) 
<br/>

![reqNegada4](https://github.com/oTalDoHud/mandalorian-dev-test/blob/main/Requisições%20testadas/Tasks/Negadas/MenorDe10%20(2).png) 
<br/>
<br/>
<br/>


## Requisições vazias:

![reqNegada5](https://github.com/oTalDoHud/mandalorian-dev-test/blob/main/Requisições%20testadas/Tasks/Negadas/ReqVazia.png) 
<br/>
<br/>
<br/>

# Persistência de dados 

A persistência dos dados aceitos foi feita utilizando o auxílio da ferramenta PostgreSQL, da seguinte forma:

![Postgre](https://github.com/oTalDoHud/mandalorian-dev-test/blob/main/Requisições%20testadas/Tasks/Aceitas/DadosPersistidos.png) 
<br/>
<br/>
<br/>

# Tecnologias utilizadas
## API
- Java
- Spring Boot
- JPA / Hibernate
- Banco de dados h2
- Maven
- Rest
- Maven
- PostgreSQL
- Git
- PostgreSQL

<br/>
<br/>

# Como executar o projeto
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/oTalDoHud/mandalorian-dev-test

# entrar na pasta do projeto back end
open git bash here

# executar o projeto
./mvnw spring-boot:run
```
<br/>
<br/>

# Autor

Hudson Lucas Teles Vieira

www.linkedin.com/in/otaldohud

hudson.lucas.vieira@gmail.com

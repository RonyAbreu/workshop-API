
# Workshop-API

Essa API é um CRUD sobre produtos de uma loja. Nela você pode criar, deletar, buscar e atualizar um Pedido, um Produto e uma Categoria. Além de Criar conta como Usuário.


## Instalação

Certifique-se que você possui instalado:
```
- Java e JDK
- Maven
- Intellij, Eclipse ou VScode
- Postman ou Insomnia
OBS: Se estiver pelo VScode, instale a extensão do Spring Boot
```
    
## Algumas funcionalidades da API

#### Retorna todos os Usuários

```http
  GET /users
```

| Descrição                           |
| :---------------------------------- |
 **Retorna todos os usuários cadastrados no sistema** |

#### Retorna um Usuário

```http
  GET /users/{id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `long` | **Retorna o usuário do ID que foi passado**. |

#### Adiciona um Usuário

```http
  POST /users
```
| Descrição                           |
| :---------------------------------- |
 **Os dados do usuário devem ser feitos em JSON** |

```json
{
    "name": "usuario",
    "email": "usuario@gmail.com",
    "phone": "(83)9 12345678",
    "password": "senhaforte"
}
```

#### Deletar um Usuário

```http
  DELETE /users/{id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `long` | **Deleta o usuário do ID que foi passado**. |

#### Deletar um Usuário

```http
  PUT /users/{id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `long` | **Atualiza o name, email e phone do usuário cujo ID foi passado**. |

```json
{
    "name": "NovoNome",
    "email": "novoemail@gmail.com",
    "phone": "(83)9 8888-8888"
}
```



## Tecnologias

Esse projeto utiliza as seguintes tecnologias:

- Java
- Spring Web
- Spring Data JPA
- Lombok
- Banco de Dados H2


## Run

Para rodar o projeto utilize o comando:

```bash
  mvn spring-boot:run
```


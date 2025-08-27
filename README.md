# Megalums

Megalums é um sistema de agendamento e envio de notificações multicanal (e-mail, SMS, push, WhatsApp) desenvolvido em Java com Spring Boot.

## Funcionalidades

- **Agendamento de notificações:** Permite agendar notificações para envio futuro, especificando canal, destinatário e mensagem.
- **Cancelamento de notificações:** Possibilidade de cancelar notificações agendadas.
- **Envio automático:** Notificações pendentes são processadas e enviadas automaticamente por um scheduler.
- **Persistência:** Utiliza MySQL para armazenar notificações, canais e status.
- **API REST:** Interface para agendamento, consulta e cancelamento de notificações.

## Estrutura do Projeto

src/ main/ java/tech/felixpanzo/megalums/ controller/ # Controllers REST dto/ # DTOs para requisições e respostas entity/ # Entidades JPA (Notification, Channel, Status) repository/ # Repositórios Spring Data JPA scheduler/ # Scheduler para envio automático service/ # Lógica de negócio config/ # Configurações iniciais (DataLoader) resources/ application.properties # Configurações da aplicação test/ java/tech/felixpanzo/megalums/ MegalumsApplicationTests.java # Teste básico de contexto docker/ docker-compose.yml # Subir banco MySQL para desenvolvimento


## Como rodar

### Pré-requisitos

- Java 21+
- Maven 3.9+
- Docker (opcional, para subir o MySQL)

### Subindo o banco de dados

Utilize o Docker Compose:

```sh
docker-compose -f [docker-compose.yml](http://_vscodecontentref_/3) up -d


O banco estará disponível em localhost:3306 com:

Database: megaludb
Usuário: root
Senha: 123
Rodando a aplicação
./mvnw spring-boot:run

A API estará disponível em http://localhost:8080.

Endpoints principais:
POST /notifications

Agenda uma nova notificação.

GET /notifications/{notificationId}

Consulta uma notificação pelo ID.

DELETE /notifications/{notificationId}

Cancela uma notificação agendada.

Configuração
Veja src/main/resources/application.properties para detalhes de configuração do banco de dados.

Observações
Os canais e status são carregados automaticamente no banco ao iniciar a aplicação (DataLoader).

O envio real das notificações ainda precisa ser implementado no método sendNotification.

Licença:

Projeto para fins de estudo e demonstração.


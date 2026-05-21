# API Inteligente com Spring AI e Spring Boot

Projeto de estudo para construir uma API REST inteligente usando Java 21, Spring Boot, Spring AI, LLMs, persistencia de historico e Docker.

## Objetivo

Criar uma API capaz de conversar com um modelo de IA, gerar propostas comerciais e salvar o historico das interacoes em banco de dados.

## Tecnologias

- Java 21
- Spring Boot 3.3.5
- Spring AI
- OpenAI
- Spring Data JPA
- PostgreSQL
- H2 Database
- Docker Compose
- Swagger/OpenAPI

## Funcionalidades

- `POST /api/chat` conversa com IA
- `POST /api/budget` gera uma proposta comercial
- `GET /api/history` lista o historico salvo
- Swagger disponivel em `/swagger-ui.html`

## Como executar

Clone o repositorio:

```bash
git clone https://github.com/RafaelSV9/api-inteligente-spring-ai.git
cd api-inteligente-spring-ai
```

Suba o PostgreSQL:

```bash
docker compose up -d
```

Configure as variaveis de ambiente com base no arquivo `.env.example`.

Execute a aplicacao:

```bash
mvn spring-boot:run
```

## Exemplo de requisicao Chat

```bash
curl -X POST http://localhost:8080/api/chat \
  -H "Content-Type: application/json" \
  -d '{"message":"Explique o que e Spring AI em poucas palavras"}'
```

## Exemplo de requisicao Budget

```bash
curl -X POST http://localhost:8080/api/budget \
  -H "Content-Type: application/json" \
  -d '{
    "customerName":"Cliente Exemplo",
    "serviceDescription":"Implantacao de monitoramento com Zabbix e Grafana",
    "estimatedValue":2300.00
  }'
```

## Roadmap

- [x] API REST inicial
- [x] Integracao com Spring AI
- [x] Persistencia de historico
- [x] Docker Compose com PostgreSQL
- [ ] Transcricao de audio
- [ ] Text-to-Speech
- [ ] Tool Calling com funcoes reais
- [ ] Autenticacao JWT

## Autor

Desenvolvido por Rafael SV como projeto de portifolio em Java, Spring Boot e Inteligencia Artificial.

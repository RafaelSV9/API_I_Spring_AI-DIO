# API Inteligente com Reconhecimento de Fala e Spring Boot

Projeto desenvolvido como parte do desafio **"Desenvolvendo sua API Inteligente com Reconhecimento de Fala e Spring Boot"**.

A proposta é construir uma API REST inteligente utilizando **Spring Boot** e **Spring AI**, integrando recursos de modelos de linguagem, transcrição de áudio, síntese de voz e execução de funções reais por meio de IA.

## Objetivo

Criar uma API capaz de receber interações do usuário, processar informações com apoio de um modelo de linguagem e integrar funcionalidades inteligentes como:

- Conversa com IA via Spring AI
- Uso de `ChatModel` e `ChatClient`
- Execução de funções reais com Tool Calling
- Transcrição de áudio para texto
- Conversão de texto em voz
- Persistência de dados com banco em Docker
- Exposição de endpoints REST
- Organização de fluxo inteligente para orquestração da aplicação

## Tecnologias utilizadas

- Java
- Spring Boot
- Spring AI
- API REST
- Docker
- Banco de dados relacional
- LLMs
- Speech-to-Text
- Text-to-Speech

## Conteúdos abordados

### Spring AI: Setup e Integração com LLMs
Configuração inicial do projeto e integração com modelos de linguagem.

### ChatModel e Modelos de Linguagem
Uso do `ChatModel` para comunicação com o modelo de IA.

### ChatClient: Fluência e Contexto no Spring AI
Criação de interações mais organizadas e contextuais usando `ChatClient`.

### Tool Calling
Execução de funções reais da aplicação a partir de comandos interpretados pela IA.

### Transcription API
Transformação de áudio em texto para permitir interação por voz.

### Speech API
Conversão de texto em áudio, simulando uma resposta falada da aplicação.

### Persistência e Infraestrutura
Configuração de banco de dados com Docker para armazenar dados da aplicação.

### Exposição REST
Criação de controllers para expor funcionalidades da API.

## Estrutura esperada do projeto

```text
src/
 └── main/
     ├── java/
     │   └── com.example.apiinteligente/
     │       ├── controller/
     │       ├── service/
     │       ├── model/
     │       ├── repository/
     │       └── config/
     └── resources/
         └── application.properties
```

## Exemplos de endpoints

```http
POST /api/chat
```

Envia uma mensagem para o assistente inteligente.

```http
POST /api/transcription
```

Recebe um arquivo de áudio e retorna o texto transcrito.

```http
POST /api/speech
```

Recebe um texto e retorna uma resposta em áudio.

## Como executar

Clone o repositório:

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```

Acesse a pasta do projeto:

```bash
cd seu-repositorio
```

Suba os serviços com Docker, caso o projeto utilize banco externo:

```bash
docker compose up -d
```

Execute a aplicação:

```bash
./mvnw spring-boot:run
```

Ou, no Windows:

```bash
mvnw.cmd spring-boot:run
```

## Aprendizados

Durante o desenvolvimento deste projeto, foram praticados conceitos importantes de APIs modernas com inteligência artificial, incluindo integração com LLMs, criação de endpoints REST, uso de serviços externos, processamento de áudio e estruturação de uma aplicação Spring Boot com foco em organização e escalabilidade.

## Autor

Desenvolvido por **Rafael SV**.

GitHub: [RafaelSV9](https://github.com/RafaelSV9)

---

Este projeto faz parte da minha jornada de aprendizado em Java, Spring Boot, APIs REST e Inteligência Artificial aplicada ao desenvolvimento backend.

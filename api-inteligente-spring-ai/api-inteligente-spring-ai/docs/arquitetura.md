# Arquitetura

Fluxo principal:

1. Cliente chama a API REST.
2. Controller recebe a requisicao.
3. Service monta o prompt.
4. Spring AI envia a mensagem ao modelo configurado.
5. A resposta e salva no banco.
6. A API retorna o resultado ao cliente.

```txt
Cliente -> Controller -> Service -> Spring AI -> LLM
                         |
                         v
                    PostgreSQL/H2
```

# Endpoints

## POST /api/chat

Envia uma mensagem para a IA.

Body:

```json
{
  "message": "Explique REST em poucas palavras"
}
```

## POST /api/budget

Gera uma proposta comercial.

Body:

```json
{
  "customerName": "Cliente Exemplo",
  "serviceDescription": "Implantacao de Zabbix e Grafana",
  "estimatedValue": 2300.00
}
```

## GET /api/history

Lista o historico de interacoes.

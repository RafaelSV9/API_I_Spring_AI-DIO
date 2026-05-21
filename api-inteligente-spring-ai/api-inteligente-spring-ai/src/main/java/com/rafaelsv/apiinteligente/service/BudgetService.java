package com.rafaelsv.apiinteligente.service;

import com.rafaelsv.apiinteligente.dto.BudgetRequest;
import com.rafaelsv.apiinteligente.dto.ChatResponse;
import com.rafaelsv.apiinteligente.model.Interaction;
import com.rafaelsv.apiinteligente.repository.InteractionRepository;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BudgetService {

    private final ChatClient chatClient;
    private final InteractionRepository repository;

    public BudgetService(ChatClient chatClient, InteractionRepository repository) {
        this.chatClient = chatClient;
        this.repository = repository;
    }

    public ChatResponse generate(BudgetRequest request) {
        String prompt = """
                Gere uma proposta comercial curta, profissional e clara.
                Cliente: %s
                Servico: %s
                Valor estimado: R$ %s
                Inclua escopo, prazo estimado e observacoes.
                """.formatted(
                request.customerName(),
                request.serviceDescription(),
                request.estimatedValue()
        );

        String response = chatClient.prompt()
                .system("Voce ajuda a criar propostas comerciais tecnicas e objetivas.")
                .user(prompt)
                .call()
                .content();

        repository.save(new Interaction("BUDGET", prompt, response));
        return new ChatResponse(response, LocalDateTime.now());
    }
}

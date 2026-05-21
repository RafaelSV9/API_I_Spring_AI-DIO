package com.rafaelsv.apiinteligente.service;

import com.rafaelsv.apiinteligente.dto.ChatResponse;
import com.rafaelsv.apiinteligente.model.Interaction;
import com.rafaelsv.apiinteligente.repository.InteractionRepository;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ChatService {

    private final ChatClient chatClient;
    private final InteractionRepository repository;

    public ChatService(ChatClient chatClient, InteractionRepository repository) {
        this.chatClient = chatClient;
        this.repository = repository;
    }

    public ChatResponse ask(String message) {
        String response = chatClient.prompt()
                .system("Voce e um assistente tecnico objetivo, claro e educado.")
                .user(message)
                .call()
                .content();

        repository.save(new Interaction("CHAT", message, response));
        return new ChatResponse(response, LocalDateTime.now());
    }
}

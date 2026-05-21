package com.rafaelsv.apiinteligente.controller;

import com.rafaelsv.apiinteligente.dto.ChatRequest;
import com.rafaelsv.apiinteligente.dto.ChatResponse;
import com.rafaelsv.apiinteligente.service.ChatService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    private final ChatService service;

    public ChatController(ChatService service) {
        this.service = service;
    }

    @PostMapping
    public ChatResponse chat(@RequestBody ChatRequest request) {
        return service.ask(request.message());
    }
}

package com.rafaelsv.apiinteligente.controller;

import com.rafaelsv.apiinteligente.model.Interaction;
import com.rafaelsv.apiinteligente.repository.InteractionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/history")
public class HistoryController {

    private final InteractionRepository repository;

    public HistoryController(InteractionRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Interaction> list() {
        return repository.findAll();
    }
}

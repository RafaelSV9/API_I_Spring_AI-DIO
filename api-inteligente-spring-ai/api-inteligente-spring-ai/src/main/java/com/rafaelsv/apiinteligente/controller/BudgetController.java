package com.rafaelsv.apiinteligente.controller;

import com.rafaelsv.apiinteligente.dto.BudgetRequest;
import com.rafaelsv.apiinteligente.dto.ChatResponse;
import com.rafaelsv.apiinteligente.service.BudgetService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/budget")
public class BudgetController {

    private final BudgetService service;

    public BudgetController(BudgetService service) {
        this.service = service;
    }

    @PostMapping
    public ChatResponse generate(@RequestBody BudgetRequest request) {
        return service.generate(request);
    }
}

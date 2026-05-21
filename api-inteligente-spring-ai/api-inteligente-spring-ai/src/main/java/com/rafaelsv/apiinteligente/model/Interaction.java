package com.rafaelsv.apiinteligente.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "interactions")
public class Interaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 80)
    private String type;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String prompt;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String response;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    protected Interaction() {}

    public Interaction(String type, String prompt, String response) {
        this.type = type;
        this.prompt = prompt;
        this.response = response;
        this.createdAt = LocalDateTime.now();
    }

    public Long getId() { return id; }
    public String getType() { return type; }
    public String getPrompt() { return prompt; }
    public String getResponse() { return response; }
    public LocalDateTime getCreatedAt() { return createdAt; }
}

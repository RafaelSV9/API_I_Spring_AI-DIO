package com.rafaelsv.apiinteligente.dto;

import java.time.LocalDateTime;

public record ChatResponse(String response, LocalDateTime createdAt) {}

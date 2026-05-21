package com.rafaelsv.apiinteligente.repository;

import com.rafaelsv.apiinteligente.model.Interaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InteractionRepository extends JpaRepository<Interaction, Long> {
}

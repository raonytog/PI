package com.example.demo;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mensagem {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDateTime horario;
    private String remetente;
    private String mensagem;
    
    protected Mensagem() { /* ... */ }

// ...
}

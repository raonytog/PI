package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.cglib.core.Local;

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

        public Mensagem(LocalDateTime horario, String remetente, String mensagem) {
            this.horario = horario;
            this.remetente = remetente;
            this.mensagem = mensagem;
        }
// ...
}

package com.example.demo;

import java.time.LocalDateTime;

public class Mensagem {
    private LocalDateTime horario;
    private String remetente;
    private String mensagem;

    public Mensagem(LocalDateTime horario, Settings settings) {
        this.horario = horario;
        this.mensagem = settings.mensagem();
        this.remetente = settings.remetente();
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}

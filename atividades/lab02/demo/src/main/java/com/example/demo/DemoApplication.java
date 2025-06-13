package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private MensagemRepository mensagemRepository;

	@PostMapping("/chat")
	public void enviarMensagem(@RequestBody Mensagem mensagem) {
		mensagemRepository.save(mensagem);
	}

	@GetMapping("/chat")
	public Iterable<Mensagem> obterMensagens() {
		return mensagemRepository.findAll();
	}

}

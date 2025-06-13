package com.example.demo;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	List<Mensagem> listaMensagem = new LinkedList<>();

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@PostMapping("/post")
	public void salvaMensagem(@RequestBody Settings settings) {
		listaMensagem.add(new Mensagem(LocalDateTime.now(), settings));
	}

	@GetMapping("/get")
	public List<Mensagem> saveMensagem() {
		return listaMensagem;
	}
}

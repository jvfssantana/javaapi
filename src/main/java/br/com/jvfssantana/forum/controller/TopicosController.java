package br.com.jvfssantana.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jvfssantana.forum.modelo.Curso;
import br.com.jvfssantana.forum.modelo.Topico;

@RestController		
public class TopicosController {

	@RequestMapping("/topicos")
	public List<Topico> lista() {
		
		Topico topico = new Topico("Dúvida java", "Preciso de ajuda com um erro de nullpointer", new Curso("Java", "Programação"));
		return Arrays.asList(topico, topico, topico);
	}
	
}
 
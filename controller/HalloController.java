package com.halogoncroz.goncroz.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController 
@RequestMapping("/hallo")

public class HalloController 
{
	@GetMapping
	public String hallo()
	{
		return "As Mentalidades mais utilizadas para concluir esta tarefa foram: Persistencia e Responsábilidade Pessoal" + 
				"\nAs habilidades mais utilizadas para concluir esta tarefa foram: Proatividade e Atenção aos detalhes";
	}
}

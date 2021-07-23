package com.halogoncroz.goncroz;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping ("/exercicio2")
public class Exercicio2 
{
	@GetMapping
	public String exercicio2()
	{
		return "Os meus objetivos de aprendizagem desta semana são vencer meus medos e inseguranças!!!";
	}
}

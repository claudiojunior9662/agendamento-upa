package com.agendamento.upa.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/especialidades")
public class EspecialidadeController {	
	
	//Paginação-----------------------------------------------------------------------------------------------
	@GetMapping("/administrador/cadastrar")
	public String cadastrar() {
		return "/especialidade/cadastro";
	}
	
	@GetMapping("/administrador/listar")
	public String listarAdm() {
		return "/especialidade/lista/administrador";
	}
	
	@GetMapping("/listar")
	public String listarGeral() {
		return "/especialidade/lista/geral";
	}
	//Paginação-----------------------------------------------------------------------------------------------
	
}

package com.agendamento.upa.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/medicos")
public class MedicoController {	
	
	//Paginação-----------------------------------------------------------------------------------------------
	@GetMapping("/administrador/cadastrar")
	public String cadastrar() {
		return "/medico/cadastro";
	}
	
	@GetMapping("/administrador/listar")
	public String listarAdm() {
		return "/medico/lista/administrador";
	}
	
	@GetMapping("/listar")
	public String listarGeral() {
		return "/medico/lista/geral";
	}
	//Paginação-----------------------------------------------------------------------------------------------
	
}

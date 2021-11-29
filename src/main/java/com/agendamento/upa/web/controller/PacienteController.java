package com.agendamento.upa.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pacientes")
public class PacienteController {	
	
	//Paginação-----------------------------------------------------------------------------------------------
	@GetMapping("/administrador/cadastrar")
	public String cadastrar() {
		return "paciente/cadastro";
	}
	
	@GetMapping("/cadastrar/inicial")
	public String cadastroInicial() {
		return "paciente/cadastroInicial";
	}
	
	@GetMapping("/administrador/listar")
	public String listarAdm() {
		return "paciente/lista/administrador";
	}
	
	@GetMapping("/listar")
	public String listarGeral() {
		return "paciente/lista/geral";
	}
	//Paginação-----------------------------------------------------------------------------------------------
	
}

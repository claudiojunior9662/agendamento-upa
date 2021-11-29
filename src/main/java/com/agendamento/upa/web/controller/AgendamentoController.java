package com.agendamento.upa.web.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/agendamentos")
public class AgendamentoController {

	//Paginação--------------------------------------------------------------------------------------------------
	@GetMapping("/novo")
	public String agendamentoGeral() {
		return "agendamento/geral";
	}
	
	@GetMapping("/administrador/novo")
	public String agendamentoAdm() {
		return "agendamento/administrador";
	}
	
	@GetMapping("/listar")
	public String listarGeral() {
		return "agendamento/lista/geral";
	}
	
	@GetMapping("/administrador/listar")
	public String listarAdm() {
		return "agendamento/lista/administrador";
	}
	//-----------------------------------------------------------------------------------------------------------
}

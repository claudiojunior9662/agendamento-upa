package com.agendamento.upa.web.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/agendamentos")
public class AgendamentoController {

	//Paginação--------------------------------------------------------------------------------------------------
	@GetMapping("/novo")
	public String agendamentoGeral() {
		return "agendamento/agendamento-geral";
	}
	
	//-----------------------------------------------------------------------------------------------------------
}

package com.agendamento.upa.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String geral() {
		return "/login/login-geral";
	}
	
	@GetMapping("/administrador")
	public String administrador() {
		return "/login/login-administrador";
	}
}

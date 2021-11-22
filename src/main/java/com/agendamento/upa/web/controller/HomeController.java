package com.agendamento.upa.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/administrador-home")
	public String homeAdm() {
		return "/home/home-adm";
	}
	
	@GetMapping("/home")
	public String home() {
		return "/home/home-geral";
	}
}

package com.agendamento.upa.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.agendamento.upa.domain.Acesso;

@Controller
public class HomeController {
	
	@GetMapping("/administrador-home")
	public static ModelAndView homeAdm() {
		ModelAndView model = new ModelAndView();
		model.setViewName("home/home-adm");
		model.addObject("acesso", new Acesso());
		return model;
	}
	
	@GetMapping("/home")
	public String home() {
		return "/home/home-geral";
	}
}

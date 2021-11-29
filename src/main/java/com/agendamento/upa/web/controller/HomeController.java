package com.agendamento.upa.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.agendamento.upa.domain.Acesso;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@GetMapping("/administrador")
	public static ModelAndView homeAdm() {
		ModelAndView model = new ModelAndView();
		model.setViewName("home/administrador");
		model.addObject("acesso", new Acesso());
		return model;
	}
	
	@GetMapping("")
	public String home() {
		return "/home/geral";
	}
}

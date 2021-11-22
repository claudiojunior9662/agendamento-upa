package com.agendamento.upa.web.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.agendamento.upa.domain.UF;
import com.agendamento.upa.domain.Unidade;

@Controller
@RequestMapping("/unidades")
public class UnidadeController {

	@GetMapping("/cadastro")
	public String cadastrar() {
		return "/unidade/cadastro";
	}
	
	@ModelAttribute("ufs")
	public UF[] listaUfs() {
		return UF.values();
	}
}

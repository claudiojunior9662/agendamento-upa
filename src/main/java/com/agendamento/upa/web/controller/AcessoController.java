package com.agendamento.upa.web.controller;

import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.agendamento.upa.domain.Acesso;
import com.agendamento.upa.service.AcessoService;
import com.agendamento.upa.util.Util;

@Controller
public class AcessoController {

	@Autowired
	private AcessoService acessoService;
	
	@GetMapping("/")
	public String geral() {
		return "/login/login-geral";
	}
	
	@GetMapping("/administrador")
	public String administrador(Acesso acesso) {
		return "/login/login-administrador";
	}
	
	@PostMapping("/entrar-adm")
	public ModelAndView entrarAdm(@Valid Acesso acesso, BindingResult result, HttpSession session) throws NoSuchAlgorithmException {
		ModelAndView model = new ModelAndView();
		model.addObject("acesso", new Acesso());
		if(result.hasErrors()) {
			model.setViewName("Acesso/entrar-adm");
		}
		
		Acesso novoAcesso = acessoService.login(acesso.getCpf(), Util.md5(acesso.getSenha()));
		if(novoAcesso == null) {
			model.addObject("fail", "Login e/ou senhas incorretos. Tente novamente.");
		}else {
			session.setAttribute("usuarioLogado", novoAcesso);
			return HomeController.homeAdm();
		}
		return model;
	}
	
}

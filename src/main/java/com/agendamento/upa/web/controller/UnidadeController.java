package com.agendamento.upa.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.agendamento.upa.domain.UF;
import com.agendamento.upa.domain.Unidade;
import com.agendamento.upa.service.UnidadeService;

@Controller
@RequestMapping("/unidades")
public class UnidadeController {

	@Autowired
	private UnidadeService unidadeService;
	
	@GetMapping("/cadastrar")
	public String cadastrar(Unidade unidade) {
		return "/unidade/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("unidades", unidadeService.buscarTodos());
		return "/unidade/lista";
	}
	
	@ModelAttribute("ufs")
	public UF[] listaUfs() {
		return UF.values();
	}
	
	@PostMapping("/salvar")
	public String salvar(@Valid Unidade unidade, BindingResult result, RedirectAttributes attr) {
		
		if(result.hasErrors()) {
			return "/unidade/cadastro";
		}
		
		unidadeService.salvar(unidade);
		attr.addFlashAttribute("success", "Unidade cadastrada com sucessso.");
		return "redirect:/unidades/cadastrar";
	}
	
	@GetMapping("/buscar/nome")
	public String getPorNome(@RequestParam("nome") String nome, ModelMap model) {
		model.addAttribute("unidades", unidadeService.buscarPorNome(nome));
		return "unidade/lista";
	}
	
	@GetMapping("/buscar/cep")
	public String getPorCep(@RequestParam("cep") String cep, ModelMap model) {
		model.addAttribute("unidades", unidadeService.buscarPorCep(cep));
		return "unidade/lista";
	}
	
	@GetMapping("/buscar/uf")
	public String getPorUf(@RequestParam("uf") UF uf, ModelMap model) {
		model.addAttribute("unidades", unidadeService.buscarPorUf(uf.getSigla()));
		return "unidade/lista";
	}
	
	
}

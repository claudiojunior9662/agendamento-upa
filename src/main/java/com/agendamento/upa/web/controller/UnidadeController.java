package com.agendamento.upa.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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

	// Paginação-----------------------------------------------------------------------------------------------
	@GetMapping("/cadastrar")
	public String cadastrar(Unidade unidade) {
		return "/unidade/cadastro";
	}

	@GetMapping("/listar-adm")
	public String listarAdm(ModelMap model) {
		model.addAttribute("unidades", unidadeService.buscarTodos());
		return "/unidade/lista/lista-adm";
	}

	@GetMapping("/listar-geral")
	public String listarGeral(ModelMap model) {
		model.addAttribute("unidades", unidadeService.buscarTodos());
		return "/unidade/lista/lista-geral";
	}

	// --------------------------------------------------------------------------------------------------------

	// Variáveis-----------------------------------------------------------------------------------------------
	@ModelAttribute("ufs")
	public UF[] listaUfs() {
		return UF.values();
	}

	// --------------------------------------------------------------------------------------------------------

	// CRUD----------------------------------------------------------------------------------------------------
	@PostMapping("/salvar")
	public String salvar(@Valid Unidade unidade, BindingResult result, RedirectAttributes attr) {

		if (result.hasErrors()) {
			return "/unidade/cadastro";
		}

		unidadeService.salvar(unidade);
		attr.addFlashAttribute("success", "Unidade cadastrada com sucessso.");
		return "redirect:/unidades/cadastrar";
	}

	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("unidade", unidadeService.buscarPorId(id));
		return "/unidade/cadastro";
	}

	@PostMapping("/editar")
	public String editar(@Valid Unidade unidade, BindingResult result, RedirectAttributes attr) {

		if (result.hasErrors()) {
			return "/unidade/cadastro";
		}

		unidadeService.editar(unidade);
		attr.addFlashAttribute("success", "Unidade editada com sucesso.");
		return "redirect:/unidades/cadastrar";
	}

	// --------------------------------------------------------------------------------------------------------

	// Consultas-----------------------------------------------------------------------------------------------
	@GetMapping("/buscar/nome-adm")
	public String getPorNomeAdm(@RequestParam("nome") String nome, ModelMap model) {
		model.addAttribute("unidades", unidadeService.buscarPorNome(nome));
		return "unidade/lista/lista-adm";

	}
	
	@GetMapping("/buscar/nome-geral")
	public String getPorNomeGeral(@RequestParam("nome") String nome, ModelMap model) {
		model.addAttribute("unidades", unidadeService.buscarPorNome(nome));
		return "unidade/lista/lista-geral";

	}

	@GetMapping("/buscar/cep-adm")
	public String getPorCepAdm(@RequestParam("cep") String cep, ModelMap model) {
		model.addAttribute("unidades", unidadeService.buscarPorCep(cep));
		return "unidade/lista/lista-adm";
	}
	
	@GetMapping("/buscar/cep-geral")
	public String getPorCepGeral(@RequestParam("cep") String cep, ModelMap model) {
		model.addAttribute("unidades", unidadeService.buscarPorCep(cep));
		return "unidade/lista/lista-geral";
	}

	@GetMapping("/buscar/uf-adm")
	public String getPorUfAdm(@RequestParam("uf") UF uf, ModelMap model) {
		model.addAttribute("unidades", unidadeService.buscarPorUf(uf.getSigla()));
		return "unidade/lista/lista-adm";
	}
	
	@GetMapping("/buscar/uf-geral")
	public String getPorUfGeral(@RequestParam("uf") UF uf, ModelMap model) {
		model.addAttribute("unidades", unidadeService.buscarPorUf(uf.getSigla()));
		return "unidade/lista/lista-geral";
	}

	// --------------------------------------------------------------------------------------------------------
}

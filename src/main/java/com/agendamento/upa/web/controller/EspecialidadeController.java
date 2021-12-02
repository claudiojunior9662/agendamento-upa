package com.agendamento.upa.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.agendamento.upa.domain.Especialidade;
import com.agendamento.upa.service.EspecialidadeService;

@Controller
@RequestMapping("/especialidades")
public class EspecialidadeController {

	@Autowired
	EspecialidadeService especialidadeService;

	// Paginação-----------------------------------------------------------------------------------------------
	@GetMapping("/administrador/cadastrar")
	public String cadastrar(Especialidade especialidade) {
		return "/especialidade/cadastro";
	}

	@GetMapping("/administrador/listar")
	public String listarAdm(ModelMap model) {
		model.addAttribute("especialidades", especialidadeService.buscarTodos());
		return "/especialidade/lista/administrador";
	}

	@GetMapping("/listar")
	public String listarGeral(ModelMap model) {
		model.addAttribute("especialidades", especialidadeService.buscarTodos());
		return "/especialidade/lista/geral";
	}
	// Paginação-----------------------------------------------------------------------------------------------

	// CRUD----------------------------------------------------------------------------------------------------
	@PostMapping("/salvar")
	public String salvar(@Valid Especialidade especialidade, BindingResult result, RedirectAttributes attr) {

		if (result.hasErrors()) {
			return "/especialidade/cadastro";
		}

		especialidadeService.salvar(especialidade);
		attr.addFlashAttribute("success", "Especialidade cadastrada com sucessso.");
		return "redirect:/especialidades/administrador/cadastrar";
	}

	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("especialidade", especialidadeService.buscarPorId(id));
		return "/especialidade/cadastro";
	}

	@PostMapping("/editar")
	public String editar(@Valid Especialidade especialidade, BindingResult result, RedirectAttributes attr) {

		if (result.hasErrors()) {
			return "/especialidade/cadastro";
		}

		especialidadeService.editar(especialidade);
		attr.addFlashAttribute("success", "Especialidade editada com sucesso.");
		return "redirect:/especialidades/administrador/cadastrar";
	}

	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, RedirectAttributes attr) {
		especialidadeService.excluir(id);
		attr.addFlashAttribute("success", "Especialidade removida com sucesso.");
		return "redirect:/especialidades/administrador/listar";
	}
}

package com.agendamento.upa.service;

import java.util.List;

import com.agendamento.upa.domain.Unidade;

public interface UnidadeService {

	void salvar(Unidade unidade);

	void editar(Unidade unidade);

	void excluir(Long id);

	Unidade buscarPorId(Long id);

	List<Unidade> buscarTodos();

	List<Unidade> buscarPorNome(String nome);
	
}

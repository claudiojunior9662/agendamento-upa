package com.agendamento.upa.service;

import java.util.List;

import com.agendamento.upa.domain.Especialidade;
import com.agendamento.upa.domain.Unidade;

public interface EspecialidadeService {

	void salvar(Especialidade especialidade);

	void editar(Especialidade especialidade);

	void excluir(Long id);

	Especialidade buscarPorId(Long id);

	List<Especialidade> buscarTodos();

	List<Especialidade> buscarPorNome(String nome);
	
}

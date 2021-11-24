package com.agendamento.upa.service;

import java.util.List;

import com.agendamento.upa.domain.Acesso;

public interface AcessoService {

	void salvar(Acesso acesso);

	void editar(Acesso acesso);

	void excluir(Long id);
	
	Acesso login(String cpf, String senha);
	
}

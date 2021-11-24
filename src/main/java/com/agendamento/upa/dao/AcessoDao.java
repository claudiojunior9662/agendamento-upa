package com.agendamento.upa.dao;

import com.agendamento.upa.domain.Acesso;

public interface AcessoDao {

	void save(Acesso acesso);

	void update(Acesso acesso);

	void delete(Long id);

	Acesso findByCpf(String cpf);
	
	Acesso buscarLogin(String cpf, String senha);
	
}

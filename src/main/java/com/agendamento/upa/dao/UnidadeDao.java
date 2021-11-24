package com.agendamento.upa.dao;

import java.util.List;

import com.agendamento.upa.domain.Unidade;

public interface UnidadeDao {

	void save(Unidade unidade);

	void update(Unidade unidade);

	void delete(Long id);

	Unidade findById(Long id);

	List<Unidade> findAll();

	List<Unidade> findByNome(String nome);

	List<Unidade> findByCep(String cep);

	List<Unidade> findByUf(String uf);
	
}

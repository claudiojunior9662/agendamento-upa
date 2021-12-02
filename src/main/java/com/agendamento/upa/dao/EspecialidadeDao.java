package com.agendamento.upa.dao;

import java.util.List;

import com.agendamento.upa.domain.Especialidade;

public interface EspecialidadeDao {

	void save(Especialidade especialidade);

	void update(Especialidade especialidade);

	void delete(Long id);

	Especialidade findById(Long id);

	List<Especialidade> findAll();

	List<Especialidade> findByNome(String nome);
	
}

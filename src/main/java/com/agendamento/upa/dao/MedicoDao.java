package com.agendamento.upa.dao;

import java.util.List;

import com.agendamento.upa.domain.Medico;

public interface MedicoDao {

	void save(Medico medico);

	void update(Medico medico);

	void delete(Long id);

	Medico findById(Long id);

	List<Medico> findAll();

	List<Medico> findByNome(String nome);
	
}

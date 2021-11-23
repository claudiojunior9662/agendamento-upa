package com.agendamento.upa.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.agendamento.upa.domain.Medico;
import com.agendamento.upa.domain.Unidade;

@Repository
public class MedicoDaoImpl extends AbstractDao<Medico, Long> implements MedicoDao{

	@Override
	public List<Medico> findByNome(String nome) {
		return createQuery("select m from Medico m where m.nome like concat ('%', ?1, '%') ", nome);
	}

	

}

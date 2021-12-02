package com.agendamento.upa.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.agendamento.upa.domain.Especialidade;
import com.agendamento.upa.domain.Unidade;

@Repository
public class EspecialidadeDaoImpl extends AbstractDao<Especialidade, Long> implements EspecialidadeDao{

	@Override
	public List<Especialidade> findByNome(String nome) {
		return createQueryList("select e from Especialidade e where e.nome like concat ('%', ?1, '%') ", nome);
	}
}

package com.agendamento.upa.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.agendamento.upa.domain.Unidade;

@Repository
public class UnidadeDaoImpl extends AbstractDao<Unidade, Long> implements UnidadeDao{

	@Override
	public List<Unidade> findByNome(String nome) {
		return createQuery("select u from Unidade u where u.nome like concat ('%', ?1, '%') ", nome);
	}

}

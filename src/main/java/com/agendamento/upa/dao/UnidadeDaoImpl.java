package com.agendamento.upa.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.agendamento.upa.domain.Unidade;

@Repository
public class UnidadeDaoImpl extends AbstractDao<Unidade, Long> implements UnidadeDao{

	@Override
	public List<Unidade> findByNome(String nome) {
		return createQueryList("select u from Unidade u where u.nome like concat ('%', ?1, '%') ", nome);
	}

	@Override
	public List<Unidade> findByCep(String cep) {
		return createQueryList("select u from Unidade u where u.endereco.cep like concat ('%', ?1, '%') ", cep);
	}

	@Override
	public List<Unidade> findByUf(String uf) {
		return createQueryList("select u from Unidade u where u.endereco.uf = ?1 ", uf);
	}

}

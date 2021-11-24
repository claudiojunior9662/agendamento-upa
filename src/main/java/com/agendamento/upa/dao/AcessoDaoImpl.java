package com.agendamento.upa.dao;

import org.springframework.stereotype.Repository;

import com.agendamento.upa.domain.Acesso;

@Repository
public class AcessoDaoImpl extends AbstractDao<Acesso, Long> implements AcessoDao{

	@Override
	public Acesso findByCpf(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Acesso buscarLogin(String cpf, String senha) {
		return createQuerySingle("select a from Acesso a where a.cpf = ?1 and a.senha = ?2", cpf, senha);
	}

	

}

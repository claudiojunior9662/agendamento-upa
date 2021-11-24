package com.agendamento.upa.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import com.agendamento.upa.dao.AcessoDao;
import com.agendamento.upa.domain.Acesso;

@Service
@Transactional
public class AcessoServiceImpl implements AcessoService{

	@Autowired
	private AcessoDao dao;
	
	@Override
	public void salvar(Acesso acesso) {
		dao.save(acesso);
	}

	@Override
	public void editar(Acesso acesso) {
		dao.update(acesso);
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override
	public Acesso login(String cpf, String senha) {
		return dao.buscarLogin(cpf, senha);
	}
	
	

}

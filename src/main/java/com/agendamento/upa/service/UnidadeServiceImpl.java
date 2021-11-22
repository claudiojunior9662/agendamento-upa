package com.agendamento.upa.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import com.agendamento.upa.dao.UnidadeDao;
import com.agendamento.upa.domain.Unidade;

@Service
@Transactional
public class UnidadeServiceImpl implements UnidadeService{

	@Autowired
	private UnidadeDao dao;
	
	@Override
	public void salvar(Unidade unidade) {
		dao.save(unidade);
	}

	@Override
	public void editar(Unidade unidade) {
		dao.update(unidade);
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Unidade buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Unidade> buscarTodos() {
		return dao.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public List<Unidade> buscarPorNome(String nome) {
		return dao.findByNome(nome);
	}

}

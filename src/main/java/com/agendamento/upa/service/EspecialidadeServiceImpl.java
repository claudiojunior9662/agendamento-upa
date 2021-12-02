package com.agendamento.upa.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import com.agendamento.upa.dao.EspecialidadeDao;
import com.agendamento.upa.domain.Especialidade;

@Service
@Transactional
public class EspecialidadeServiceImpl implements EspecialidadeService{

	@Autowired
	private EspecialidadeDao dao;
	
	@Override
	public void salvar(Especialidade especialidade) {
		dao.save(especialidade);
	}

	@Override
	public void editar(Especialidade especialidade) {
		dao.update(especialidade);
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Especialidade buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Especialidade> buscarTodos() {
		return dao.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public List<Especialidade> buscarPorNome(String nome) {
		return dao.findByNome(nome);
	}
}

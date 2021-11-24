package com.agendamento.upa.domain;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@SuppressWarnings("serial")
@Entity
@Table(name = "ACESSOS")
public class Acesso extends AbstractEntity<Long> {
	
	@NotBlank(message = "Insira o CPF.")
	@Column(unique = true, nullable = false)
	private String cpf;
	
	@NotBlank(message = "Insira a senha.")
	@Column(nullable = false)
	private String senha;
	
	private Timestamp data;
	
	@NotNull(message = "Insira o nível de acesso.")
	@Column(nullable = false)
	private Integer nivelAcesso;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Timestamp getData() {
		return data;
	}

	public void setData(Timestamp data) {
		this.data = data;
	}

	public Integer getNivelAcesso() {
		return nivelAcesso;
	}

	public void setNivelAcesso(Integer nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}
	
	
}

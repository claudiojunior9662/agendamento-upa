package com.agendamento.upa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@SuppressWarnings("serial")
@Entity
@Table(name = "ESPECIALIDADES")
public class Especialidade extends AbstractEntity<Long> {

	@NotBlank(message = "Informe o nome da especialidade.")
	@Column(nullable = false, unique = true)
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}

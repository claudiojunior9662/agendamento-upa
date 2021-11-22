package com.agendamento.upa.domain;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "UNIDADES")
public class Unidade extends AbstractEntity<Long>{

	@NotBlank(message = "Informe um nome para a unidade.")
	@Size(max = 60, message = "O nome da unidade deve ter no máximo {max} caracteres.")
	@Column(nullable = false, unique = true)
	private String nome;
	
	@Valid
	@OneToOne
	@JoinColumn(name = "endereco_id_fk")
	private Endereco endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	
}

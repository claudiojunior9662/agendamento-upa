package com.agendamento.upa.domain;

import javax.persistence.*;
import javax.validation.constraints.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "MEDICOS")
public class Medico extends AbstractEntity<Long> {

	@NotBlank(message = "Informe o nome do médico.")
	@Column(nullable = false, unique = true)
	private String nome;

	@NotBlank(message = "Informe o número do CPF.")
	@Column(nullable = false, unique = true)
	private String cpf;

	@NotBlank(message = "Informe o número do CRM.")
	@Column(nullable = false, unique = true)
	private String crm;

	@NotNull(message = "Informe a UF de expedição do CRM.")
	@Column(nullable = false)
	private UF crmUf;

	@NotNull(message = "Informe um contato para o médico.")
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "contato_id_fk")
	private Contato contato;

	@NotNull(message = "Informe um endereco para o médico.")
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "endereco_id_fk")
	private Endereco endereco;

	@NotNull(message = "Informe uma especialidade para o médico.")
	@ManyToOne
	@JoinColumn(name = "especialidade_id_fk")
	private Especialidade especialidade;

	@NotNull(message = "Informe uma unidade para o médico.")
	@ManyToOne
	@JoinColumn(name = "unidade_id_fk")
	private Unidade unidade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public UF getCrmUf() {
		return crmUf;
	}

	public void setCrmUf(UF crmUf) {
		this.crmUf = crmUf;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

}

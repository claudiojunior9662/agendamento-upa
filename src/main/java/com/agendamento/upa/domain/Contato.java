package com.agendamento.upa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@SuppressWarnings("serial")
@Entity
@Table(name = "CONTATOS")
public class Contato extends AbstractEntity<Long> {

	@NotNull(message = "Informe um número de telefone.")
	@Column(nullable = false, unique = true)
	private String telefone;

	@NotNull(message = "Informe um tipo de telefone.")
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private TipoTelefone tipoTelefone;

	@NotBlank(message = "Informe um email.")
	@Column(nullable = false, unique = true)
	private String email;

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public TipoTelefone getTipoTelefone() {
		return tipoTelefone;
	}

	public void setTipoTelefone(TipoTelefone tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

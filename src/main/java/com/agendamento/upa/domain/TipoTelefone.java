package com.agendamento.upa.domain;

public enum TipoTelefone {
	F("F", "Fixo"), C("C", "Celular");
	
	private String tipo;
	private String descricao;
	
	private TipoTelefone(String tipo, String descricao) {
		this.tipo = tipo;
		this.descricao = descricao;
	}

	public String getTipo() {
		return tipo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	
	
}

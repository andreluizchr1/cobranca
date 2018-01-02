package com.algaworks.model;

public enum StatusTitulo {

	PEDENTE("Pendente"), RECEBIDO("Recebido");

	private String descricao;

	StatusTitulo(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}

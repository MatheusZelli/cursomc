package com.matheuszelli.cursomc.domain.enums;

public enum TipoCliente {
	
	//controle de qual numero corresponde a qual enumeracao;
	//para evitar conflito de dados em possíveis alterações
	PESSOAFISICA(1, "Pessoa Física"),
	PESSOAJURIDICA(2, "Pessoa Jurídica");
	
	private int cod;
	private String descricao;
	
	//construtor de enumeração é sempre private
	private TipoCliente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String descricao() {
		return descricao;
	}

	//fazer a busca de um tipocliente passando um cod
	public static TipoCliente toEnum(Integer cod) {
		
		if (cod == null) {
			return null;
		}
		
		for(TipoCliente x : TipoCliente.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: "+ cod);
		
	}
}

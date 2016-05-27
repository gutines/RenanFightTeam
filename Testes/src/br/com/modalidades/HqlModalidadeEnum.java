package br.com.modalidades;

public enum HqlModalidadeEnum {
	
	LISTAR_MODALIDADE ("from Modalidades"),
	CONSULTAR_MODALIDADE ("");
	
	private final String hqlModalidade;

	private HqlModalidadeEnum(String hqlModalidade) {
		this.hqlModalidade = hqlModalidade;
	}

	public String getHqlModalidade() {
		return hqlModalidade;
	}
	
	
	
	

}

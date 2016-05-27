package br.com.planos;

public enum HqlPlanosEnum {
	
	LISTAR_PLANOS ("from Planos"),
	CONSULTAR_PLANO_ID("from Endereco where idPlano = :idPlano");
	
	private final String hqlPlano;
	
	private HqlPlanosEnum(String hqlPlano) {
		this.hqlPlano = hqlPlano;
	}

	public String getHqlPlano() {
		return hqlPlano;
	}	

}

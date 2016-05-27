package br.com.parametros;

public enum HqlStatusGeralEnum {

	CONSULTAR_STATUS_ATIVO ("from Statusgeral where idStatus = 1"),
	CONSULTAR_STATUS_INATIVO ("from Statusgeral where idStatus = 2");
	
	private final String hqlStatusGeral;

	private HqlStatusGeralEnum(String hqlStatusGeral) {
		this.hqlStatusGeral = hqlStatusGeral;
	}

	public String getHqlStatusGeral() {
		return hqlStatusGeral;
	}
	
	
}

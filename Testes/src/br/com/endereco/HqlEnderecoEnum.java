package br.com.endereco;

public enum HqlEnderecoEnum {

	BUSCAR_ENDERECO_CEP ("from Endereco where cep = :cep");
	
	private final String hqlEndereco;

	private HqlEnderecoEnum(String hqlEndereco) {
		this.hqlEndereco = hqlEndereco;
	}

	public String getHqlEndereco() {
		return hqlEndereco;
	}
	
}

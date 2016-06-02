/**
 * 
 */
package br.com.parametros;

/**
 * @author Augusto
 * 
 * TODO 
 *
 */
public enum TipoPesquisaEnum {
	
	PESQUISA_ID("ID", 1), PESQUISA_NOME("Nome", 2), PESQUISA_CPF("CPF", 3);
	
	private final String litPesquisa;
	private final int codPsquisa;

	
	private TipoPesquisaEnum(String litPesquisa, int codPsquisa) {
		this.litPesquisa = litPesquisa;
		this.codPsquisa = codPsquisa;
	}


	public String getLitPesquisa() {
		return litPesquisa;
	}


	public int getCodPsquisa() {
		return codPsquisa;
	}

}

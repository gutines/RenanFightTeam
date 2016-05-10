package br.com.planos;

import br.com.parametros.StatusGeral;

/**
 * 
 * Classe Objeto de Planos
 * 
 * Objeto espelho da tabela de Planos
 * Utilizada como camada intermediária entre o Bean e o BackBean
 * 
 * Status: Concluido
 *
 */

public class Planos {

	private int idPlano;
    private String planoDescricao;
    private StatusGeral statusgeral;
    
	public int getIdPlano() {
		return idPlano;
	}
	public void setIdPlano(int idPlano) {
		this.idPlano = idPlano;
	}
	public String getPlanoDescricao() {
		return planoDescricao;
	}
	public void setPlanoDescricao(String planoDescricao) {
		this.planoDescricao = planoDescricao;
	}
	public StatusGeral getStatusgeral() {
		return statusgeral;
	}
	public void setStatusgeral(StatusGeral statusgeral) {
		this.statusgeral = statusgeral;
	}
}

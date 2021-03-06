package br.com.planos;

import br.com.parametros.StatusGeralDb;

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
    private StatusGeralDb statusgeral;
    
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
	public StatusGeralDb getStatusgeral() {
		return statusgeral;
	}
	public void setStatusgeral(StatusGeralDb statusgeral) {
		this.statusgeral = statusgeral;
	}
}

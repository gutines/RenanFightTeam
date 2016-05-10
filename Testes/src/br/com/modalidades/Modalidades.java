package br.com.modalidades;

import model.Statusgeral;


/**
 * 
 * Classe Objeto de Modalidades
 * 
 * Objeto espelho da tabela de Modalidades
 * Utilizada como camada intermediária entre o Bean e o BackBean
 * 
 * Status: Concluido
 *
 */
public class Modalidades {
	
	private int idModalidade;
	private String descricaoModalidade;
	private Statusgeral statusgeral;
	
	
	public int getIdModalidade() {
		return idModalidade;
	}
	public void setIdModalidade(int idModalidade) {
		this.idModalidade = idModalidade;
	}
	public String getDescricaoModalidade() {
		return descricaoModalidade;
	}
	public void setDescricaoModalidade(String descricaoModalidade) {
		this.descricaoModalidade = descricaoModalidade;
	}
	public Statusgeral getStatusgeral() {
		return statusgeral;
	}
	public void setStatusgeral(Statusgeral statusgeral) {
		this.statusgeral = statusgeral;
	}
	
	
	
}

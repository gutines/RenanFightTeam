package br.com.planos;

/************************************************************************
 *                                                                      *
 * @author Augusto                                                      *
 *                                                                      *
 *	Class Name: PlanoBean                                               *
 *	                                                                    *
 *	Objetivo: Classe respons�vel pelos dados do plano                   *
 *	                                                                    *
 *	                                                                    *
 *	Status: Em desenvolvimento                                          *
 *	                                                                    *
 *	                                                                    *
 ************************************************************************
 *  Altera��es                                                          *
 *	                                                                    *
 *	                                                                    *
 *	                                                                    *
 *	                                                                    * 
 ************************************************************************/

public class PlanoBean {
	
	private int idPlano;
    private String planoDescricao;
    
    
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
    
    

}

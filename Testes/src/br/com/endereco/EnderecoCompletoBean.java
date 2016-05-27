package br.com.endereco;

/************************************************************************
 *                                                                      *
 * @author Augusto                                                      *
 *                                                                      *
 *	Class Name: EnderecoAlunoBean                                       *
 *	                                                                    *
 *	Objetivo: Classe herda a classe EnderecoBean, possui os dados       *
 *	          complementarares do endereco para o aluno.                *
 *	                                                                    *
 *	Status: Em desenvolvimento                                          *
 *	                                                                    *
 *	                                                                    *
 ************************************************************************
 *  Alterações                                                          *
 *	                                                                    *
 *	                                                                    *
 *	                                                                    *
 *	                                                                    * 
 ************************************************************************/

public class EnderecoCompletoBean extends EnderecoBean{
	
	private String numero;
	private String complemento;
	
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	

}

package br.com.login;

/**
 * Classe de itera��o com o Banco de Daddos
 * 
 * Status: Concluido
 */

import org.hibernate.Query;

import hibernate.DataBasesExecute;

public class LoginDataBases extends DataBasesExecute {

	// Metodo de busca do usu�rio para valida��o da senha
	// Par�metros: idUsuario

	public Object buscaUsuario(String hql, String parm, String parmValue) {		
		Query q = getSession().createQuery(hql);
		q.setParameter(parm, parmValue);		
						
		return q.uniqueResult();
	}
	
	

}

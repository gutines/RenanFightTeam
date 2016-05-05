package br.com.login;

/**
 * Classe de iteração com o Banco de Daddos
 * 
 * Status: Concluido
 */

import org.hibernate.Query;

import hibernate.DataBasesExecute;

public class LoginDataBases extends DataBasesExecute {

	// Metodo de busca do usuário para validação da senha
	// Parâmetros: idUsuario

	public Object buscaUsuario(String hql, String parm, String parmValue) {		
		Query q = getSession().createQuery(hql);
		q.setParameter(parm, parmValue);		
						
		return q.uniqueResult();
	}
	
	

}

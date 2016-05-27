package br.com.modalidades;

import java.util.ArrayList;

import model.Alunos;
import model.Modalidades;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Projections;

import hibernate.DataBasesExecute;
import hibernate.HibernateUtil;

// TODO Excluir Classe Descontinuado
public class ModalidadeDataBases extends DataBasesExecute{

	public Object consultaParametro(String hql, String parm, String parmValue){
		Query q = getSession().createQuery(hql);
		q.setParameter(parm, parmValue);		
						
		return q.uniqueResult();
		
	}
		 
	// Retorna lista de objeto
	public <E> ArrayList<E> retornarLista(String hql){
		Query q = getSession().createQuery(hql);		
		
		return (ArrayList<E>) q.list();

	}
	
	public void insertModalidade(Modalidades modalidades){
		getSession().save(modalidades);
	}
	
}

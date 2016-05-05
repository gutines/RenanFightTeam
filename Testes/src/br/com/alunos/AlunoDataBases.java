package br.com.alunos;

import java.util.ArrayList;

import model.Alunos;
import model.Modalidades;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Projections;

import hibernate.DataBasesExecute;

public class AlunoDataBases extends DataBasesExecute{

	public Object consultaParametro(String hql, String parm, String parmValue){
		Query q = getSession().createQuery(hql);
		q.setParameter(parm, parmValue);		
						
		return q.uniqueResult();
		
	}
	
	public int nextIdAluno(){
		Criteria criteria = getSession().createCriteria(Alunos.class);

		Integer auxIdAluno = (Integer) criteria.setProjection(
				Projections.max("idAlunos")).uniqueResult();		
		auxIdAluno++;
		return auxIdAluno;
	}
	 
	// Retorna lista de objeto
	public <E> ArrayList<E> retornarLista(String hql){
		Query q = getSession().createQuery(hql);		
		
		return (ArrayList<E>) q.list();

	}
	
	private void retornaLista(String hql, String parmetro, String valParmetro){
		
	}
}

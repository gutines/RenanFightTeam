package br.com.alunos;

import java.sql.SQLException;
import java.util.ArrayList;

import model.Alunos;
import model.Modalidades;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.criterion.Projections;

import br.com.messages.MessagesEnum;
import hibernate.DataBasesExecute;

public class AlunoDataBases extends DataBasesExecute {

	public Object consultaParametro(String hql, String parm, String parmValue) {
		Query q = getSession().createQuery(hql);
		q.setParameter(parm, parmValue);

		return q.uniqueResult();

	}

	public int nextIdAluno() {
		Criteria criteria = getSession().createCriteria(Alunos.class);

		Integer auxIdAluno = (Integer) criteria.setProjection(
				Projections.max("idAlunos")).uniqueResult();
		auxIdAluno++;
		return auxIdAluno;
	}

	public void insertAluno(Alunos alunos) {
		
		try {
			getSession().save(alunos);
		} catch (HibernateException e) {
			tratarErro(MessagesEnum.DATA_BASES_ERROR_DATA_BASES);
		}
	}

}

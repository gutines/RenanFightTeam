package br.com.alunos;

import hibernate.HibernateUtil;
import model.Alunos;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;

/************************************************************************
 * *
 * 
 * @author Augusto
 * 
 *         ClassName: AlunosDAO
 * 
 *         Objetivo: Classe de acesso so Banco de Dados do objeto Alunos
 * 
 * 
 *         Status: Em desenvolvimento
 ************************************************************************
 *         Alterações
 * 
 ************************************************************************/

public class AlunosDAO extends HibernateUtil {

	private Session sessao;
	
	public AlunosDAO() {
		sessao = getSessionFactory().openSession();
		sessao.beginTransaction();
	}

	public int proximoIdAluno() {

		Criteria criteria = sessao.createCriteria(Alunos.class);

		Integer auxIdAluno = (Integer) criteria.setProjection(
				Projections.max("idAlunos")).uniqueResult();

		auxIdAluno++;

		return auxIdAluno.intValue();

	}
	
	public void cadastrarAluno(Alunos aluno){
		sessao.save(aluno);
		
	}
	
	public void comitar(){
		sessao.getTransaction().commit();
	}
	
}

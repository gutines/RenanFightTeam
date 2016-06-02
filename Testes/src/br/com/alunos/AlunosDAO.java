package br.com.alunos;

import java.util.ArrayList;

import hibernate.HibernateUtil;
import model.Alunos;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;

import br.com.modalidades.HqlModalidadeEnum;

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

	public void cadastrarAluno(Alunos aluno) {
		sessao.save(aluno);

	}

	public void comitar() {
		sessao.getTransaction().commit();
	}

	public int proximoIdAluno() {

		Criteria criteria = sessao.createCriteria(Alunos.class);

		Integer auxIdAluno = (Integer) criteria.setProjection(
				Projections.max("idAlunos")).uniqueResult();

		auxIdAluno++;

		return auxIdAluno.intValue();

	}

	public ArrayList<Alunos> filtrarPorId(String idAluno) {

		Query q = sessao.createQuery(HqlAlunosEnum.LISTAR_ALUNO_ID
				.getHqlAlunos());

		q.setParameter("idAlunos", idAluno);

		return (ArrayList<Alunos>) q.list();

	}

	public ArrayList<Alunos> filtrarPorNome(String nomeCompleto) {

		Query q = sessao.createQuery(HqlAlunosEnum.LISTAR_ALUNO_NOME
				.getHqlAlunos());

		q.setParameter("nomeCompleto", '%' + nomeCompleto + '%');

		return (ArrayList<Alunos>) q.list();

	}

	public ArrayList<Alunos> filtrarPorCpf(String cpf) {

		Query q = sessao.createQuery(HqlAlunosEnum.LISTAR_ALUNO_CPF
				.getHqlAlunos());

		q.setParameter("cpf", cpf);

		return (ArrayList<Alunos>) q.list();

	}
}

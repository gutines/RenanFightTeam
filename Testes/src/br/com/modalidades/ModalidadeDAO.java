package br.com.modalidades;

import hibernate.HibernateUtil;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;

import model.Modalidades;
import model.Modalidadescontratadas;

/************************************************************************
 * *
 * 
 * @author Augusto * * Class Name: ModalidadeDAO
 * 
 *         Objetivo: Classe de acesso so Banco de Dados do objeto Modalidade
 * 
 * 
 *         Status: Em desenvolvimento
 ************************************************************************
 *         Alterações
 * 
 ************************************************************************/

public class ModalidadeDAO extends HibernateUtil {

	private Session sessao;
	private Modalidades modalidades;

	public ModalidadeDAO() {
		sessao = getSessionFactory().openSession();
		sessao.beginTransaction();
		
		modalidades = new Modalidades();
	}
	

	// Retorna lista de objeto
	public <Modalidades> ArrayList<Modalidades> listarModalidades() {

		Query q = sessao.createQuery(HqlModalidadeEnum.LISTAR_MODALIDADE
				.getHqlModalidade());
		
		
		return (ArrayList<Modalidades>) q.list();

	}

	public void atrelarModalidade(Modalidadescontratadas modalidades) {
		
		sessao.save(modalidades);
		
	}


	public Modalidades getModalidades() {
		return modalidades;
	}


	public void setModalidades(Modalidades modalidades) {
		this.modalidades = modalidades;
	}
	
	
	public void comitar(){
		sessao.getTransaction().commit();
	}

}

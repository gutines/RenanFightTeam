package br.com.planos;

import java.util.ArrayList;

import hibernate.HibernateUtil;
import model.Endereco;

import org.hibernate.Query;
import org.hibernate.Session;

import br.com.endereco.HqlEnderecoEnum;

/************************************************************************
 * *
 * 
 * @author Augusto 
 * 
 *         ClassName: PlanosDAO
 * 
 *         Objetivo: Classe de acesso so Banco de Dados do objeto Planos
 * 
 * 
 *         Status: Em desenvolvimento
 ************************************************************************
 *         Alterações
 * 
 ************************************************************************/
public class PlanosDAO extends HibernateUtil {

	private Session sessao;
	
	private model.Planos planos;
	
		
	public PlanosDAO() {
		
		sessao = getSessionFactory().openSession();
		sessao.beginTransaction();
		
		planos = new model.Planos();
	}

	
	public <Planos> ArrayList<Planos> listarPlanos() {

		Query q = sessao.createQuery(HqlPlanosEnum.LISTAR_PLANOS.getHqlPlano());
		return (ArrayList<Planos>) q.list();

	}
	
	
	public model.Planos consultarPlano(int idPlano){
		
		Query q = sessao.createQuery(HqlPlanosEnum.CONSULTAR_PLANO_ID.getHqlPlano());
		q.setParameter("idPlano", idPlano);
		
		planos = (model.Planos) q.uniqueResult();
		
		return planos;
	}

	
	public model.Planos getPlanos() {
		return planos;
	}

	
	public void setPlanos(model.Planos planos) {
		this.planos = planos;
	}

}

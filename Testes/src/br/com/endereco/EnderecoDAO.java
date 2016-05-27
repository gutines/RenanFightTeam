package br.com.endereco;

import model.Endereco;
import org.hibernate.Query;
import org.hibernate.Session;
import hibernate.HibernateUtil;

/************************************************************************
 * *
 * 
 * @author Augusto
 * 
 *         ClassName: EnderecoDAO
 * 
 *         Objetivo: Classe de acesso so Banco de Dados do objeto Endereco
 * 
 * 
 *         Status: Em desenvolvimento
 ************************************************************************
 *         Alterações
 * 
 ************************************************************************/
public class EnderecoDAO extends HibernateUtil {

	private Session sessao;

	private Endereco endereco;
	
	public EnderecoDAO() {
		sessao = getSessionFactory().openSession();
		sessao.beginTransaction();
	}
	
	public Endereco buscarEnderecoCep(String cep){
		
		Query q = sessao.createQuery(HqlEnderecoEnum.BUSCAR_ENDERECO_CEP.getHqlEndereco());
		q.setParameter("cep", cep);
		
		endereco = (Endereco) q.uniqueResult();
				
		return endereco;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}

package br.com.tutorial.controller;

import hibernate.HibernateUtil;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import model.Usuarios;

import org.hibernate.Query;
import org.hibernate.Session;
import beans.LoginBean;

@RequestScoped
@ManagedBean
public class Login {

	private String title = "Renan Fight Team";
	private String pagina = "paginas/renanfightteam.jsf";
	private String message;
	private LoginBean loginBean;

	// HQL para consulta de usuario

	private final String CONSULTA_USUARIO = "from Usuarios where idUsuario = :idUsuario";

	// Objeto de sessao;

	Session session;
	Usuarios u;

	@PostConstruct
	public void init() {
		session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
	}

	public void executar(LoginBean loginBean) {
		
		this.loginBean = loginBean;
		
		buscaUsuario();		
		
		// Validação se Usuário e Senha estão corretos
		if (this.loginBean.getIdUsuario().equals(u.getIdUsuario()) && this.loginBean.getSenha().equals(u.getSenha())) {
			try {
				FacesContext.getCurrentInstance().getExternalContext()
						.redirect(getPagina());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Erro no redirect da pagina" + getPagina());
			}
		} else {
			System.out.println("Usuario/Senha Inválido!");			
		}
	}
	
	// Efetua busca do usuário no Banco
	private void buscaUsuario() {
		Query q = session.createQuery(CONSULTA_USUARIO);
		q.setParameter("idUsuario", loginBean.getIdUsuario());
		u = (Usuarios) q.uniqueResult();
	}

	/**
	 * @return the loginBean
	 */
	public LoginBean getLoginBean() {
		return loginBean;
	}

	/**
	 * @param loginBean the loginBean to set
	 */
	public void setLoginBean(LoginBean loginBean) {
		this.loginBean = loginBean;
	}

	public String getTitle() {
		return this.title;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String p) {
		this.message = p;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the pagina
	 */
	public String getPagina() {
		return pagina;
	}

	/**
	 * @param pagina
	 *            the pagina to set
	 */
	public void setPagina(String pagina) {
		this.pagina = pagina;
	}

}

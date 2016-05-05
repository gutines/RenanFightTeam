/**
 * 
 */
package br.com.usuarios;

import java.util.Date;

import hibernate.HibernateUtil;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.hibernate.Session;

import br.com.renanfighteam.RenanFightTeam;
import model.Usuarios;

/**
 * @author Augusto
 *
 */

@ManagedBean
@ViewScoped
public class NovoUsuario implements java.io.Serializable {

	// Configuração da pagina
	private String title = "Novo Usuario";
	private String componente;

	// Dados da pagina
	private String usuario;
	private String senha;
	private String senha_confirmacao;
	private Usuarios usuarios = new Usuarios();
	private Date date = new Date();

	// Objeto de sessao
	Session session;

	// Métodos
	//

	@PostConstruct
	public void init() {
		System.out.println("init()");
		session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
	}

	/**
	 * Area de metodos de ação na pagina de Novo Usuário
	 */

	public String inserirNovoUsuario() {
		System.out.println("inserirNovoUsuario()");

		RenanFightTeam rft = new RenanFightTeam();
		boolean processoOk = false;

		if (!senha.equals(null) && !senha.equals("")) {
			if (!senha_confirmacao.equals(null)
					&& !senha_confirmacao.equals("")) {
				if (senha.equals(senha_confirmacao)) {
					// Se senhas identicas, prosseguir com processamento
					usuarios.setIdUsuario(usuario);
					usuarios.setSenha(senha);
					usuarios.setDataDeInclusao(date);
					System.out.println(date);
					session.save(usuarios);
					session.getTransaction().commit();
					processoOk = true;
				} else {
					addMessage("Erro", "Senha não confere!");
				}
			}else{
				addMessage("Erro", "Campo Confirme a Senha em branco!");
			}							
		}else{
			addMessage("Erro", "Campo Senha em branco!");
		}

		if (processoOk) {
			componente = rft.getRENAN_FIGHT_TEAM_PAGE();
			addMessage("Sucesso", "Usuário Cadastrado!");
		}

		return componente;

	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	public void addMessage(String summary, String detail) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
				summary, detail);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the usuarios
	 */
	public Usuarios getUsuarios() {
		return usuarios;
	}

	/**
	 * @param usuarios
	 *            the usuarios to set
	 */
	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha
	 *            the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * @return the senha_confirmacao
	 */
	public String getSenha_confirmacao() {
		return senha_confirmacao;
	}

	/**
	 * @param senha_confirmacao
	 *            the senha_confirmacao to set
	 */
	public void setSenha_confirmacao(String senha_confirmacao) {
		this.senha_confirmacao = senha_confirmacao;
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario
	 *            the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}

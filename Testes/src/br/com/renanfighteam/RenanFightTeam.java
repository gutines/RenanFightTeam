package br.com.renanfighteam;

import java.io.IOException;

import hibernate.HibernateUtil;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import model.Alunos;

import org.hibernate.Query;
import org.hibernate.Session;

@ManagedBean
@ViewScoped
public class RenanFightTeam implements java.io.Serializable{

	
	// Dados da pagina
	private final String TITLE = "Renan Fight Team";
	private String componente = "";

	// Paginas dos menus
	private final String NOVO_ALUNO = "/paginas/alunos/alunonovo.xhtml";
	private final String PAGINA_FUNDO = "/paginas/paginafundo.xhtml";
	private final String NOVO_USUARIO = "/paginas/usuarios/novoUsuario.xhtml";
	private final String RENAN_FIGHT_TEAM_PAGE = "/paginas/renanfightteam.xhtml";
	
	
	
	// Teste protótipo filtro de pesquisa
	private final String FILTRO_PESQUISA_ALUNO = "/paginas/alunos/filtropesquisaaluno.xhtml";

	private final String TESTE_FOTO = "/paginas/teste/testes.xhtml";
	// Objeto de sessao
	Session session;

	// Objetos

	@PostConstruct
	public void init() {
		session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		setComponente(PAGINA_FUNDO);
	}

	public void conectaHibernate() {
		Query q = session.createQuery("from Alunos where idAlunos = :idAlunos");
		q.setParameter("idAlunos", 1);
		Alunos a = (Alunos) q.uniqueResult();
		System.out.println("Aluno: " + a.getNomeCompleto());
	}

	/**
	 * @return the componente
	 */
	public String getComponente() {
		return componente;
	}

	/**
	 * @param componente
	 *            the componente to set
	 */
	public void setComponente(String componente) {
		this.componente = componente;
	}

	/**
	 * Seta o componente de novo aluno para ser carregado na pagina
	 */
	public void novoAluno() {
//		try {
//			FacesContext.getCurrentInstance().getExternalContext()
//					.redirect(NOVO_ALUNO);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("Erro no redirect da pagina" + NOVO_ALUNO);
//		}
		
		setComponente(NOVO_ALUNO);
	}

	/**
	 * Seta o componente de novo usuário para ser carregado na pagina
	 */
	public void novoUsuario() {
		setComponente(NOVO_USUARIO);
		
	}
	
	public void filtroPesquisa(){
		setComponente(FILTRO_PESQUISA_ALUNO);
	}

	public void voltar() {
		setComponente(PAGINA_FUNDO);
	}

	/**
	 * @return the pAGINA_FUNDO
	 */
	public String getPAGINA_FUNDO() {
		return PAGINA_FUNDO;
	}

	/**
	 * @return the rENAN_FIGHT_TEAM_PAGE
	 */
	public String getRENAN_FIGHT_TEAM_PAGE() {
		return RENAN_FIGHT_TEAM_PAGE;
	}

	public void telaInicial() {
		setComponente(PAGINA_FUNDO);
	}

	public void testeFoto(){
		setComponente(TESTE_FOTO);
	}
}

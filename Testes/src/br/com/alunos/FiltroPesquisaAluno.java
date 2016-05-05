package br.com.alunos;

import java.io.IOException;
import java.util.ArrayList;

import hibernate.HibernateUtil;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import model.Alunos;
import org.hibernate.Query;
import org.hibernate.Session;
import beans.FiltroPesquisaAlunoBean;

@ManagedBean
@ViewScoped
/**
 * @author Augusto
 *
 *         Classe controle para filtro de pesquisa do aluno
 *
 */
public class FiltroPesquisaAluno implements java.io.Serializable {

	// Queries
	private final String CONSULTA_ALUNO_ID = "from Alunos where idAlunos = :idAlunos";
	private final String CONSULTA_ALUNO_NOME = "from Alunos where nomeCompleto like :nomeCompleto";
	private final String CONSULTA_ALUNO_CPF = "from Alunos where cpf = :cpf";

	// Dados
	private FiltroPesquisaAlunoBean filtroPesquisa = new FiltroPesquisaAlunoBean();
	private boolean showResultTable = false;

	// Dados da pagina
	private final String MENU_INICIAL = "/Testes/paginas/renanfightteam.jsf";
	private final String ALUNO_ALTERAR = "/paginas/alunos/alunoalterar.xhtml";
	Session session;

	/**
	 * Tratamento para efetuar a pesquisa do aluno
	 */
	public void pesquisarAluno() {
		session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		validarTipoPesquisa();

		showResultTable = true;
	}

	/**
	 * Função Cancelar Pesquisa
	 */
	public void cancelar() {

		try {
			FacesContext.getCurrentInstance().getExternalContext()
					.redirect(MENU_INICIAL);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Validar tipo de pesquisa
	 */

	private void validarTipoPesquisa() {
		        
		switch (filtroPesquisa.getTipoPesquisa()) {
		case PESQUISA_ID:
			pesquisaId();
			break;
		case PESQUISA_NOME:
			pesquisaNome();
			break;
		case PESQUISA_CPF:
			pesquisaCpf();
			break;

		}

	}

	// Pesquisar por ID do aluno
	private void pesquisaId() {
		Query q = session.createQuery(CONSULTA_ALUNO_ID);
		q.setParameter("idAlunos", filtroPesquisa.getValorPesquisa());

		filtroPesquisa.setAlunoLista(((ArrayList<Alunos>) q.list()));

	}

	// Pesquisar por nome do aluno
	private void pesquisaNome() {
		Query q = session.createQuery(CONSULTA_ALUNO_NOME);
		q.setParameter("nomeCompleto",
				'%' + filtroPesquisa.getValorPesquisa() + '%');

		filtroPesquisa.setAlunoLista(((ArrayList<Alunos>) q.list()));
	}

	// Pesquisar por CPF
	private void pesquisaCpf() {
		Query q = session.createQuery(CONSULTA_ALUNO_CPF);
		q.setParameter("cpf", filtroPesquisa.getValorPesquisa());
		
		filtroPesquisa.setAlunoLista(((ArrayList<Alunos>) q.list()));

	}
	
	// Tela Alterar Aluno
	
	public String alterarAluno(){
		return ALUNO_ALTERAR;
	}

	/**
	 * Getters and Setters
	 */
	
	public FiltroPesquisaAlunoBean getFiltroPesquisa() {
		return filtroPesquisa;
	}

	public void setFiltroPesquisa(FiltroPesquisaAlunoBean filtroPesquisa) {
		this.filtroPesquisa = filtroPesquisa;
	}

	public boolean isShowResultTable() {
		return showResultTable;
	}

	public void setShowResultTable(boolean showResultTable) {
		this.showResultTable = showResultTable;
	}

}

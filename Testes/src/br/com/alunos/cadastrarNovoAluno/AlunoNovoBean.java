package br.com.alunos.cadastrarNovoAluno;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.hibernate.HibernateException;
import org.primefaces.event.FlowEvent;
import org.primefaces.model.UploadedFile;

import beans.FotoBean;
import br.com.alunos.AlunoDataBases;
import br.com.messages.MessagesEnum;
import br.com.messages.MessagesErrorImp;
import br.com.modalidades.ModalidadeDataBases;
import br.com.parametros.PaginasEnum;
import br.com.parametros.StatusGeralDb;
import model.Alunos;
import model.Endereco;
import model.Modalidades;
import model.Modalidadescontratadas;
import model.ModalidadescontratadasId;
import model.Planos;
import model.Statusgeral;

/**
 * 
 * Classe Implementação do AlunoNovo
 * 
 * Camada que trata a inclusão de um novo aluno no Banco de Dados
 * 
 * Status: Em Desenvolvimento
 * 
 * Tasks: TODO AlunoNovoBean: 1) Construir todo o tratamento de AlunoNovoImpl;
 * TODO AlunoNovoBean: 2) Espelhar a classe AlunoNovo antiga melhorando os
 * tratamentos. TODO AlunoNovoBean 3) Método save() Tratar erro de Hibernate
 * TODO AlunoNovoBean 4) Apresentação de Mensagens de sucessos e erros
 */

@ManagedBean
@ViewScoped
public class AlunoNovoBean implements java.io.Serializable {

	// Queries
	private final String HQL_LISTAR_MODALIDADES = "from Modalidades";
	private final String HQL_LISTAR_PLANOS = "from Planos";
	private final String HQL_BUSCA_CEP = "from Endereco where cep = :cep";

	// Objetos
	private Alunos alunoNovo = new Alunos();
	private AlunoDataBases alunoDataBases = new AlunoDataBases();
	private Planos planoSelecionado = new Planos();
	private ArrayList<Modalidades> modalidadesContratadas = new ArrayList<Modalidades>();
	private FotoBean fotoBean = new FotoBean();
	
	// Listas
	private ArrayList<Modalidades> listaModalidades = new ArrayList<Modalidades>();
	private ArrayList<Planos> listaPlanos = new ArrayList<Planos>();

	// Variaveis da classe

	private final String PARM_CEP = "cep";
	private String cep;

	/**
	 * Métodos de ação do aluno
	 */

	// Iniciar campos da tela
	public AlunoNovoBean() {
		buscaIdAlunoDisponivel();
		listarModalidades();
		listarPlanos();

		alunoNovo.setResponsavel(false);

	}

	// Carregar próximo id de aluno disponível
	private void buscaIdAlunoDisponivel() {
		alunoNovo.setIdAlunos(alunoDataBases.nextIdAluno());
	}

	// Carregar Lista de Modalidades
	private void listarModalidades() {
		listaModalidades = alunoDataBases.retornarLista(HQL_LISTAR_MODALIDADES);
	}

	// Carregar Lista de Planos
	private void listarPlanos() {
		listaPlanos = alunoDataBases.retornarLista(HQL_LISTAR_PLANOS);
	}

	// Retorna cep solicitado
	public void carregaCep() {
		try {
			Endereco e = (Endereco) alunoDataBases.consultaParametro(
					HQL_BUSCA_CEP, PARM_CEP, getCep());
			alunoNovo.setEndereco(e);
		} catch (HibernateException e) {
			tratarErro(MessagesEnum.DATA_BASES_ERROR_DATA_BASES);
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

	public void save() {

		try {
			inserirAluno();
			atrelarModalidades();
			alunoDataBases.getSession().getTransaction().commit();
		} catch (HibernateException e) {
			tratarErro(MessagesEnum.DATA_BASES_ERROR_DATA_BASES);
		}

		redirectPaginaInicial();

	}

	public void cancelar() {
		redirectPaginaInicial();
	}

	// Redireciona pagina para o menu inicial
	private void redirectPaginaInicial() {

		try {

			FacesContext.getCurrentInstance().getExternalContext()
					.redirect(PaginasEnum.MENU_INICIAL_COMP.getPagina());

		} catch (IOException e) {

			tratarErro(MessagesEnum.FATAL_ERROR_REDIRECT_PAGE);

		}
	}

	private void inserirAluno() {

		StatusGeralDb sgdb = new StatusGeralDb();
		alunoNovo.setStatusgeral((Statusgeral) sgdb.consultaParametro(
				sgdb.getHQL_CONSULTA_STATUS(), sgdb.getPARM_STATUS(), "1"));
		alunoDataBases.insertAluno(alunoNovo);

	}

	// Insere modalidades contratadas
	private void atrelarModalidades() {

		Date data = new java.sql.Date(new java.util.Date().getDate());

		for (Iterator<Modalidades> iterator = modalidadesContratadas.iterator(); iterator
				.hasNext();) {

			Modalidades auxModalidades = (Modalidades) iterator.next();
			ModalidadescontratadasId mcid = new ModalidadescontratadasId(
					auxModalidades.getIdModalidade(), alunoNovo.getIdAlunos());

			Modalidadescontratadas mc = new Modalidadescontratadas();
			data = new java.sql.Date(new java.util.Date().getTime());

			mc.setId(mcid);
			mc.setDataDeContratacao(data);

			alunoDataBases.getSession().save(mc);

		}
	}

	// Método de tratamento de erros e mensagens
	private void tratarErro(MessagesEnum me) {
		MessagesErrorImp mei = new MessagesErrorImp();

		mei.setMessageEnum(me);
		mei.tratarMensagemErro();
	}

	/***********************
	 * Getters and Setters *
	 ***********************
	 */

	public Alunos getAlunoNovo() {
		return alunoNovo;
	}

	public void setAlunoNovo(Alunos alunoNovo) {
		this.alunoNovo = alunoNovo;
	}

	public ArrayList<Modalidades> getListaModalidades() {
		return listaModalidades;
	}

	public void setListaModalidades(ArrayList<Modalidades> listaModalidades) {
		this.listaModalidades = listaModalidades;
	}

	public ArrayList<Planos> getListaPlanos() {
		return listaPlanos;
	}

	public void setListaPlanos(ArrayList<Planos> listaPlanos) {
		this.listaPlanos = listaPlanos;
	}

	public Planos getPlanoSelecionado() {
		return planoSelecionado;
	}

	public void setPlanoSelecionado(Planos planoSelecionado) {
		this.planoSelecionado = planoSelecionado;
		alunoNovo.setPlanos(planoSelecionado);
	}

	public ArrayList<Modalidades> getModalidadesContratadas() {
		return modalidadesContratadas;
	}

	public void setModalidadesContratadas(
			ArrayList<Modalidades> modalidadesContratadas) {
		this.modalidadesContratadas = modalidadesContratadas;
	}

	public String alunoNovo() {
		return PaginasEnum.ALUNO_NOVO_COMP.getPagina();

	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public FotoBean getFotoBean() {
		return fotoBean;
	}

	public void setFotoBean(FotoBean fotoBean) {
		this.fotoBean = fotoBean;
	}
}

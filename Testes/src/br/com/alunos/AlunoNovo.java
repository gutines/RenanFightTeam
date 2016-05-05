/**
 * 
 */
package br.com.alunos;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import beans.*;
import hibernate.HibernateUtil;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.primefaces.event.FlowEvent;

import model.Alunos;
import model.Endereco;
import model.Modalidades;
import model.Modalidadescontratadas;
import model.ModalidadescontratadasId;
import model.Planos;
import model.Statusgeral;

/**
 * @author Augusto
 *
 *         Classe de Cadastro de novo aluno
 *
 */

@ManagedBean
@ViewScoped
public class AlunoNovo implements java.io.Serializable {

	// Queries
	private final String BUSCA_CEP = "from Endereco where cep = :cep";
	private final String CARREGA_MODALIDADES = "from Modalidades";
	private final String CARREGA_PLANOS = "from Planos";
	private final String ID_ALUNO_DIPONIVEL = "from Alunos";

	// Objetos do aluno
	private AlunoNovoBean aluno = new AlunoNovoBean();
	private ArrayList<Modalidades> modalidades = new ArrayList<Modalidades>();
	private ArrayList<Modalidades> modalidadesContratadas = new ArrayList<Modalidades>();
	private ArrayList<Planos> planos = new ArrayList<Planos>();
	private Planos planoSelecionado = new Planos();
	private Alunos alunoModel = new Alunos();

	// Dados da pagina
	private final String MENU_INICIAL = "/Testes/paginas/renanfightteam.jsf";
	Session session;

	// Variaveis da pagina
	private String cep;
	private boolean renderizarEndereco = false;

	/**
	 * Contrutor da Pagina Status: Concluido
	 */

	@PostConstruct
	public void init() {
		session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		// Setando propriedades da pagina
		getIdAlunoDisponivel();
		buscaModalidades();
		buscaPlanos();

		aluno.setResponsavel(false);

	}

	// Metodos auxiliares da inicialização

	/**
	 * Buscar Cep para apresentar na pagina Status: Concluido Status: Concluido
	 */
	public void buscarCep() {
		Query q = session.createQuery(BUSCA_CEP);
		q.setParameter("cep", cep);
		Endereco endereco = (Endereco) q.uniqueResult();

		EnderecoBean e = new EnderecoBean();

		e.setCep(endereco.getCep());
		e.setLogradouro(endereco.getLogradouro());
		e.setNomeDaRua(endereco.getNomeDaRua());
		e.setBairro(endereco.getBairro());
		e.setCidade(endereco.getCidade());
		e.setEstado(endereco.getEstado());
		e.setPais(endereco.getPais());

		setRenderizarEndereco(true);

		aluno.setEndereco(e);

	}

	/**
	 * Buscar modalidades para apresentar no combo Status: TODO Corrigir carga e
	 * apresentação da modalidade no combo
	 */
	private void buscaModalidades() {
		System.out.println("buscaModalidades()");
		Query q = session.createQuery(CARREGA_MODALIDADES);

		modalidades = ((ArrayList<Modalidades>) q.list());

	}

	/**
	 * Buscar plano para apresentar no radioButton Status: TODO Corrigir carga e
	 * apresentação dos planos no radioButton
	 */
	private void buscaPlanos() {
		Query q = session.createQuery(CARREGA_PLANOS);
		planos = (ArrayList<Planos>) q.list();
	}

	/**
	 * Metodo para recuperar o Id Aluno disponivel Status: Criar tratamento
	 * quando ainda não houver registro.
	 * 
	 * TODO Criar tratamento quando ainda não houver registro.
	 */
	private void getIdAlunoDisponivel() {
		Criteria criteria = session.createCriteria(Alunos.class);

		Integer auxIdAluno = (Integer) criteria.setProjection(
				Projections.max("idAlunos")).uniqueResult();

		auxIdAluno++;

		aluno.setIdAluno(auxIdAluno.intValue());

	}

	// Métodos

	/**
	 * @return the aluno
	 */
	public AlunoNovoBean getAluno() {
		return aluno;
	}

	/**
	 * @param aluno
	 *            the aluno to set
	 */
	public void setAluno(AlunoNovoBean aluno) {
		this.aluno = aluno;
	}

	/**
	 * @return the cep
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * @param cep
	 *            the cep to set
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}

	/**
	 * @return the renderizarEndereco
	 */
	public boolean isRenderizarEndereco() {
		return renderizarEndereco;
	}

	/**
	 * @param renderizarEndereco
	 *            the renderizarEndereco to set
	 */
	public void setRenderizarEndereco(boolean renderizarEndereco) {
		this.renderizarEndereco = renderizarEndereco;
	}

	/**
	 * @return the modalidades
	 */
	public ArrayList<Modalidades> getModalidades() {

		return modalidades;
	}

	/**
	 * @return the modalidadesContratadas
	 */
	public ArrayList<Modalidades> getModalidadesContratadas() {
		return modalidadesContratadas;
	}

	/**
	 * @param modalidadesContratadas
	 *            the modalidadesContratadas to set
	 */
	public void setModalidadesContratadas(
			ArrayList<Modalidades> modalidadesContratadas) {

		this.modalidadesContratadas = modalidadesContratadas;
	}

	/**
	 * @return the planos
	 */
	public ArrayList<Planos> getPlanos() {
		return planos;
	}

	/**
	 * @param planos
	 *            the planos to set
	 */
	public void setPlanos(ArrayList<Planos> planos) {
		this.planos = planos;
	}

	// Métodos de ação

	/**
	 * @return the planoSelecionado
	 */
	public Planos getPlanoSelecionado() {
		return planoSelecionado;
	}

	/**
	 * @param planoSelecionado
	 *            the planoSelecionado to set
	 */
	public void setPlanoSelecionado(Planos planoSelecionado) {
		this.planoSelecionado = planoSelecionado;
	}

	public void save() {

		inserirAluno();
		atrelarModalidades();
		session.getTransaction().commit();

		FacesMessage msg = new FacesMessage("Successful",
				"Aluno cadastrado com sucesso!");
		FacesContext.getCurrentInstance().addMessage(null, msg);

		voltar();
	}

	public void voltar() {

		try {
			FacesContext.getCurrentInstance().getExternalContext()
					.redirect(MENU_INICIAL);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void inserirAluno() {
		alunoModel.setIdAlunos(aluno.getIdAluno());
		alunoModel.setNomeCompleto(aluno.getNomeCompleto());
		alunoModel.setApelido(aluno.getApelido());
		alunoModel.setDataDeNascimento(aluno.getDataDeNascimento());
		alunoModel.setRg(aluno.getRg());
		alunoModel.setCpf(aluno.getCpf());
		alunoModel.setResponsavel(aluno.isResponsavel());

		if (aluno.isResponsavel()) {
			alunoModel.setNomeResponsavel(aluno.getNomeResponsavel());
		}

		// Busca Cep e seta objeto endereco diretamento no model
		Query q = session.createQuery(BUSCA_CEP);
		q.setParameter("cep", aluno.getEndereco().getCep());
		alunoModel.setEndereco((Endereco) q.uniqueResult());

		alunoModel.setNumero(aluno.getNumeroResidencia());
		alunoModel.setComplemento(aluno.getComplemento());
		alunoModel.setTelefoneContato(aluno.getTelefoneContato());
		alunoModel.setTelefoneEmergencia(aluno.getTelefoneEmergencia());
		alunoModel.setContatoEmergencia(aluno.getContatoEmergencia());
		alunoModel.setEmail(aluno.getEmail());

		alunoModel.setDiaVencimento(aluno.getDiaVencimeto());
		alunoModel.setAtestadoMedico(aluno.isAtestadoMedico());
		alunoModel.setPlanos(planoSelecionado);

		alunoModel.setStatusgeral(statusGeral(1));

		session.save(alunoModel);
	}

	private void atrelarModalidades() {

		Date data = new java.sql.Date(new java.util.Date().getDate());

		for (Iterator<Modalidades> iterator = modalidadesContratadas.iterator(); iterator
				.hasNext();) {

			Modalidades auxModalidades = (Modalidades) iterator.next();

			/**
			 * Area de inclusão da chave da tabela de relacionamento de
			 * modalidades contratadas
			 */

			ModalidadescontratadasId mcid = new ModalidadescontratadasId(
					auxModalidades.getIdModalidade(), aluno.getIdAluno());

			Modalidadescontratadas mc = new Modalidadescontratadas();

			data = new java.sql.Date(new java.util.Date().getTime());

			mc.setId(mcid);
			mc.setDataDeContratacao(data);

			session.save(mc);

		}
	}

	private Statusgeral statusGeral(int status) {

		Query q = session
				.createQuery("from Statusgeral where idStatus = :status");
		q.setParameter("status", status);
		Statusgeral statusGeral = ((Statusgeral) q.uniqueResult());

		return statusGeral;

	}

	/**
	 * Metodo controlador de passos do painel Wizard
	 */
	public String onFlowProcess(FlowEvent event) {
		return event.getNewStep();

	}

}

package br.com.alunos.alunoNovo;

import java.io.IOException;
import java.util.ArrayList;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.FlowEvent;
import org.primefaces.model.UploadedFile;

import br.com.alunos.AlunoDataBases;
import br.com.parametros.PaginasEnum;
import model.Alunos;
import model.Endereco;
import model.Modalidades;
import model.Planos;

/**
 * 
 * Classe Implementação do AlunoNovo
 * 
 * Camada que trata a inclusão de um novo aluno no Banco de Dados
 * 
 * Status: Em Desenvolvimento
 * 
 * Tasks
 * 	TODO AlunoNovoImpl: 1) Construir todo o tratamento de AlunoNovoImpl;
 *  TODO AlunoNovoImpl: 2) Espelhar a classe AlunoNovo antiga melhorando os tratamentos.
 * 
 */
@ManagedBean
@ViewScoped
public class AlunoNovoImpl implements java.io.Serializable{

	// Queries
	private final String HQL_LISTAR_MODALIDADES = "from Modalidades";
	private final String HQL_LISTAR_PLANOS = "from Planos";
	private final String HQL_BUSCA_CEP = "from Endereco where cep = :cep";

	// Objetos
	private Alunos alunoNovo = new Alunos();
	private AlunoDataBases alunoDataBases = new AlunoDataBases();
	private Planos planoSelecionado = new Planos();
	private ArrayList<Modalidades> modalidadesContratadas = new ArrayList<Modalidades>();

	// Listas
	private ArrayList<Modalidades> listaModalidades = new ArrayList<Modalidades>();
	private ArrayList<Planos> listaPlanos = new ArrayList<Planos>();
	
	// Variaveis da classe
	
	private final String PARM_CEP = "cep";
	private UploadedFile file;
	private String cep;

	/**
	 * Métodos de ação do aluno
	 */

	public AlunoNovoImpl() {
		buscaIdAlunoDisponivel();
		listarModalidades();
		listarPlanos();
		
		
		// Iniciar campos da tela
		
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
	public void carregaCep(){
		Endereco e = (Endereco) alunoDataBases.consultaParametro(HQL_BUSCA_CEP, PARM_CEP, getCep());
		alunoNovo.setEndereco(e);
	}
	
	public void save(){
		redirectPaginaInicial();
	}
	
	private void redirectPaginaInicial() {

		try {
			FacesContext.getCurrentInstance().getExternalContext()
					.redirect(PaginasEnum.MENU_INICIAL_RED.getPagina());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	}

	public ArrayList<Modalidades> getModalidadesContratadas() {
		return modalidadesContratadas;
	}

	public void setModalidadesContratadas(
			ArrayList<Modalidades> modalidadesContratadas) {
		this.modalidadesContratadas = modalidadesContratadas;
	}
	
	/**
	 * Metodo controlador de passos do painel Wizard
	 */
	public String onFlowProcess(FlowEvent event) {
		return event.getNewStep();

	}
	
	public UploadedFile getFile() {
        return file;
    }
 
    public void setFile(UploadedFile file) {
        this.file = file;
    }
	
    public void upload() {
        if(file != null) {
            FacesMessage message = new FacesMessage("Succesful", file.getFileName() + " is uploaded.");
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
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
}

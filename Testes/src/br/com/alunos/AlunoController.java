package br.com.alunos;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import model.Alunos;
import br.com.endereco.EnderecoController;
import br.com.modalidades.ModalidadesController;
import br.com.planos.PlanoController;

/************************************************************************
 *                                                                      *
 * @author Augusto                                                      *
 *                                                                      *
 *	Class Name: AlunoController                                         *
 *	                                                                    *
 *	Objetivo: Classe responsável pelo tratamento de um aluno como       *
 *	          recuperar os dados de um aluno, mover as variáveis        *
 *	          para os beans                                            *
 *	                                                                    *
 *	Status: Em desenvolvimento                                          *
 *	                                                                    *
 *	                                                                    *
 ************************************************************************
 *  Alterações                                                          *
 *	                                                                    *
 *	                                                                    *
 *	                                                                    *
 *	                                                                    * 
 ************************************************************************/
@ManagedBean
@ViewScoped
public class AlunoController {
	
	private Alunos aluno = new Alunos();
	private ArrayList<Alunos> alunoLista = new ArrayList<Alunos>();
	private AlunosDAO dao = new AlunosDAO();
	
	private EnderecoController enderecoController = new EnderecoController();
	private ModalidadesController modalidadesController = new ModalidadesController() ;
	private PlanoController planoController = new PlanoController();
	
		
//	@PostConstruct
	public void proximoIdAluno(){
			
		aluno.setIdAlunos(dao.proximoIdAluno());
		
	}			
	
	public Alunos getAluno() {
		return aluno;
	}


	public void setAluno(Alunos aluno) {
		this.aluno = aluno;
	}

	public ArrayList<Alunos> getAlunoLista() {
		return alunoLista;
	}

	public void setAlunoLista(ArrayList<Alunos> alunoLista) {
		this.alunoLista = alunoLista;
	}

	public AlunosDAO getDao() {
		return dao;
	}

	public void setDao(AlunosDAO dao) {
		this.dao = dao;
	}

	public EnderecoController getEnderecoController() {
		return enderecoController;
	}

	public void setEnderecoController(EnderecoController enderecoController) {
		this.enderecoController = enderecoController;
	}

	public ModalidadesController getModalidadesController() {
		return modalidadesController;
	}

	public void setModalidadesController(ModalidadesController modalidadesController) {
		this.modalidadesController = modalidadesController;
	}

	public PlanoController getPlanoController() {
		return planoController;
	}

	public void setPlanoController(PlanoController planoController) {
		this.planoController = planoController;
	}

	
}

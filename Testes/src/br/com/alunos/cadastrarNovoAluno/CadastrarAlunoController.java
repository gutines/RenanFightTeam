package br.com.alunos.cadastrarNovoAluno;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.hibernate.HibernateException;

import br.com.alunos.AlunoController;
import br.com.endereco.EnderecoController;
import br.com.messages.MessagesEnum;
import br.com.modalidades.ModalidadesController;
import br.com.parametros.PaginasEnum;
import br.com.parametros.StatusUtil;
import br.com.planos.PlanoController;

/************************************************************************
 * *
 * 
 * @author Augusto
 * 
 *         ClassName: CadastrarAlunoController
 * 
 *         Objetivo: Classe responsável pelo tratamento do cadastro de um
 * 
 *         novo aluno, bem como atrelar o plano e modalidades escolhidas
 * 
 *         Status: Em desenvolvimento
 ************************************************************************
 *         Alterações
 * 
 ************************************************************************/
@ManagedBean
@ViewScoped
public class CadastrarAlunoController {

//	private AlunoController alunoController = new AlunoController();
//	private EnderecoController enderecoController = new EnderecoController();
//	private ModalidadesController modalidadesController = new ModalidadesController() ;
//	private PlanoController planoController = new PlanoController();
//	
//	@PostConstruct
//	public void init(){
//		alunoController.proximoIdAluno();
//	}
			
	public void cadastrarAluno(AlunoController alunoController){
		
		StatusUtil su = new StatusUtil();
		
		alunoController.getAluno().setEndereco(alunoController.getEnderecoController().getEndereco());
		alunoController.getAluno().setPlanos(alunoController.getPlanoController().getPlanoContratado());
		alunoController.getAluno().setStatusgeral(su.getDao().statusAtivo());
		alunoController.getDao().cadastrarAluno(alunoController.getAluno());
		alunoController.getDao().comitar();
		alunoController.getModalidadesController().atrelarModalidade(alunoController.getAluno());
		
		redirectPaginaInicial();
		
	}
	
	
	private void redirectPaginaInicial(){
		
		try {
			FacesContext.getCurrentInstance().getExternalContext()
					.redirect(PaginasEnum.MENU_INICIAL_COMP.getPagina());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	
//	public ModalidadesController getModalidadesController() {
//		return modalidadesController;
//	}
//
//	public void setModalidadesController(
//			ModalidadesController modalidadesController) {
//		this.modalidadesController = modalidadesController;
//	}
//
//	public AlunoController getAlunoController() {
//		return alunoController;
//	}
//
//	public void setAlunoController(AlunoController alunoController) {
//		this.alunoController = alunoController;
//	}
//
//	public PlanoController getPlanoController() {
//		return planoController;
//	}
//
//	public void setPlanoController(PlanoController planoController) {
//		this.planoController = planoController;
//	}
//
//	public EnderecoController getEnderecoController() {
//		return enderecoController;
//	}
//
//	public void setEnderecoController(EnderecoController enderecoController) {
//		this.enderecoController = enderecoController;
//	}

}

package br.com.alunos;

import java.util.ArrayList;

import model.Alunos;
import br.com.endereco.EnderecoCompletoBean;
import br.com.endereco.EnderecoController;
import br.com.modalidades.ModalidadesBean;
import br.com.modalidades.ModalidadesController;
import br.com.planos.PlanoBean;
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
public class AlunoController {
	
	private Alunos aluno = new Alunos();
	private AlunosDAO dao = new AlunosDAO();
	
	
	public AlunoController(){
		proximoIdAluno();
	}
	
	public void proximoIdAluno(){
			
		aluno.setIdAlunos(dao.proximoIdAluno());
		
	}			
	
	public Alunos getAluno() {
		return aluno;
	}


	public void setAluno(Alunos aluno) {
		this.aluno = aluno;
	}

	public AlunosDAO getDao() {
		return dao;
	}

	public void setDao(AlunosDAO dao) {
		this.dao = dao;
	}


			
	

	
}

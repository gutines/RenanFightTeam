package br.com.alunos;

import br.com.alunos.cadastrarNovoAluno.AlunoNovoBean;

/**
 * 
 * Classe Implementação do Aluno
 * 
 * Camada que trata todos as funções do aluno
 * 	- Incluir;
 * 	- Consultar;
 * 	- Alterar;
 * 	- Excluir;
 * 
 * Status: Em Desenvolvimento
 * 
 * Tasks
 * 	TODO AlunoImpl: 1) Construir todo o tratamento de AlunoNovo;
 *  TODO AlunoImpl: 2) Construir todo o tratamento de AlunoConsultar;
 *  TODO AlunoImpl: 3) Construir todo o tratamento de AlunoAlterar;
 *  TODO AlunoImpl: 4) Construir todo o tratamento de AlunoExcluir;
 */

public class AlunoImpl {

	private AlunoNovoBean alunoNovoBean = new AlunoNovoBean();

	public AlunoNovoBean getAlunoNovoImpl() {
		return alunoNovoBean;
	}

	public void setAlunoNovoImpl(AlunoNovoBean alunoNovoBean) {
		this.alunoNovoBean = alunoNovoBean;
	}
	
	
}

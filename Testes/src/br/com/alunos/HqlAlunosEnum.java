package br.com.alunos;

public enum HqlAlunosEnum {
	
	LISTAR_ALUNO ("from Alunos"),
	LISTAR_ALUNO_ID ("from Alunos where idAlunos = :idAlunos"),
	LISTAR_ALUNO_NOME ("from Alunos where nomeCompleto like :nomeCompleto"),
	LISTAR_ALUNO_CPF ("from Alunos where cpf = :cpf");
	
	
	private final String hqlAlunos;

	
	private HqlAlunosEnum(String hqlAlunos) {
		this.hqlAlunos = hqlAlunos;
	}


	public String getHqlAlunos() {
		return hqlAlunos;
	}
	
	
	
	
	

}

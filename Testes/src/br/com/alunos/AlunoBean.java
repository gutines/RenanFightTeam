package br.com.alunos;

import java.util.Date;


/************************************************************************
 *                                                                      *
 * @author Augusto                                                      *
 *                                                                      *
 *	Class Name: AlunoBean                                               *
 *	                                                                    *
 *	Objetivo: Classe que possui os dados basicos do aluno               *
 *	                                                                    *
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


public class AlunoBean {
	
	private int idAlunos;    
    private String nomeCompleto;
    private String apelido;
    private Date dataDeNascimento;
    private String rg;
    private String cpf;
    private Boolean responsavel;
    private String nomeResponsavel;
    private String telefoneContato;
    private String telefoneEmergencia;
    private String contatoEmergencia;
    private String email;
    private Boolean atestadoMedico;
    private int diaVencimento;
    private String foto;
    
    
	public int getIdAlunos() {
		return idAlunos;
	}
	public void setIdAlunos(int idAlunos) {
		this.idAlunos = idAlunos;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Boolean getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Boolean responsavel) {
		this.responsavel = responsavel;
	}
	public String getNomeResponsavel() {
		return nomeResponsavel;
	}
	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}
	public String getTelefoneContato() {
		return telefoneContato;
	}
	public void setTelefoneContato(String telefoneContato) {
		this.telefoneContato = telefoneContato;
	}
	public String getTelefoneEmergencia() {
		return telefoneEmergencia;
	}
	public void setTelefoneEmergencia(String telefoneEmergencia) {
		this.telefoneEmergencia = telefoneEmergencia;
	}
	public String getContatoEmergencia() {
		return contatoEmergencia;
	}
	public void setContatoEmergencia(String contatoEmergencia) {
		this.contatoEmergencia = contatoEmergencia;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getAtestadoMedico() {
		return atestadoMedico;
	}
	public void setAtestadoMedico(Boolean atestadoMedico) {
		this.atestadoMedico = atestadoMedico;
	}
	public int getDiaVencimento() {
		return diaVencimento;
	}
	public void setDiaVencimento(int diaVencimento) {
		this.diaVencimento = diaVencimento;
	}

	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
    
    

}

package br.com.alunos;

import java.util.Date;

import br.com.endereco.*;
import br.com.planos.*;
import br.com.parametros.StatusGeral;


/**
 * 
 * Classe Objeto de Alunos
 * 
 * Objeto espelho da tabela de Alunos
 * Utilizada como camada intermediária entre o Bean e o BackBean
 * 
 * Status: Em desenvolvimento
 *
 */
public class Aluno {
	
	//TODO br.com.alunos.Alunos.java -> Concluir listagem do objeto

	private Integer idAlunos;      
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
    private String numero;
    private String complemento;
    private byte[] foto;
    
    //Objetos externos
    private Endereco endereco;
    private Planos planos;
    private StatusGeral statusgeral;
    
    public Integer getIdAlunos() {
		return idAlunos;
	}
	public void setIdAlunos(Integer idAlunos) {
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
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public byte[] getFoto() {
		return foto;
	}
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Planos getPlanos() {
		return planos;
	}
	public void setPlanos(Planos planos) {
		this.planos = planos;
	}
	public StatusGeral getStatusgeral() {
		return statusgeral;
	}
	public void setStatusgeral(StatusGeral statusgeral) {
		this.statusgeral = statusgeral;
	}
	
}

package beans;

import java.util.ArrayList;
import java.util.Date;

public class AlunoNovoBean {
	
	// Atributos
	private int idAluno;
	private String nomeCompleto;
	private String apelido;
	private Date dataDeNascimento;
	private String rg;
	private String cpf;
	private boolean responsavel;
	private String nomeResponsavel;	
	private String telefoneContato;
	private String telefoneEmergencia;
	private String contatoEmergencia;
	private String email;
	private boolean atestadoMedico;
	private int diaVencimeto;
	private String numeroResidencia;
	private String complemento;
	private byte[] foto;	
	private int statusAluno;
	private EnderecoBean endereco;
	private ArrayList<ModalidadesBean> modalidades;
	private PlanoBean plano;
	
	// Métodos
	
	/**
	 * @return the idAluno
	 */
	public int getIdAluno() {
		return idAluno;
	}
	/**
	 * @param idAluno the idAluno to set
	 */
	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}
	/**
	 * @return the nomeCompleto
	 */
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	/**
	 * @param nomeCompleto the nomeCompleto to set
	 */
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	/**
	 * @return the apelido
	 */
	public String getApelido() {
		return apelido;
	}
	/**
	 * @param apelido the apelido to set
	 */
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	/**
	 * @return the dataDeNascimento
	 */
	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}
	/**
	 * @param dataDeNascimento the dataDeNascimento to set
	 */
	public void setDataDeNascimento(Date dataDeNascimento) {
		System.out.println("Data de Nascimento" + dataDeNascimento);
		this.dataDeNascimento = dataDeNascimento;
	}
	/**
	 * @return the rg
	 */
	public String getRg() {
		return rg;
	}
	/**
	 * @param rg the rg to set
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}
	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}
	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	/**
	 * @return the responsavel
	 */
	public boolean isResponsavel() {
		return responsavel;
	}
	/**
	 * @param responsavel the responsavel to set
	 */
	public void setResponsavel(boolean responsavel) {
		this.responsavel = responsavel;
	}
	/**
	 * @return the nomeResponsavel
	 */
	public String getNomeResponsavel() {
		return nomeResponsavel;
	}
	/**
	 * @param nomeResponsavel the nomeResponsavel to set
	 */
	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}
	/**
	 * @return the telefoneContato
	 */
	public String getTelefoneContato() {
		return telefoneContato;
	}
	/**
	 * @param telefoneContato the telefoneContato to set
	 */
	public void setTelefoneContato(String telefoneContato) {
		this.telefoneContato = telefoneContato;
	}
	/**
	 * @return the telefoneEmergencia
	 */
	public String getTelefoneEmergencia() {
		return telefoneEmergencia;
	}
	/**
	 * @param telefoneEmergencia the telefoneEmergencia to set
	 */
	public void setTelefoneEmergencia(String telefoneEmergencia) {
		this.telefoneEmergencia = telefoneEmergencia;
	}
	/**
	 * @return the contatoEmergencia
	 */
	public String getContatoEmergencia() {
		return contatoEmergencia;
	}
	/**
	 * @param contatoEmergencia the contatoEmergencia to set
	 */
	public void setContatoEmergencia(String contatoEmergencia) {
		this.contatoEmergencia = contatoEmergencia;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the atestadoMedico
	 */
	public boolean isAtestadoMedico() {
		return atestadoMedico;
	}
	/**
	 * @param atestadoMedico the atestadoMedico to set
	 */
	public void setAtestadoMedico(boolean atestadoMedico) {
		this.atestadoMedico = atestadoMedico;
	}
	/**
	 * @return the diaVencimeto
	 */
	public int getDiaVencimeto() {
		return diaVencimeto;
	}
	/**
	 * @param diaVencimeto the diaVencimeto to set
	 */
	public void setDiaVencimeto(int diaVencimeto) {
		this.diaVencimeto = diaVencimeto;
	}
	/**
	 * @return the numeroResidencia
	 */
	public String getNumeroResidencia() {
		return numeroResidencia;
	}
	/**
	 * @param numeroResidencia the numeroResidencia to set
	 */
	public void setNumeroResidencia(String numeroResidencia) {
		this.numeroResidencia = numeroResidencia;
	}
	/**
	 * @return the complemento
	 */
	public String getComplemento() {
		return complemento;
	}
	/**
	 * @param complemento the complemento to set
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	/**
	 * @return the foto
	 */
	public byte[] getFoto() {
		return foto;
	}
	/**
	 * @param foto the foto to set
	 */
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	/**
	 * @return the statusAluno
	 */
	public int getStatusAluno() {
		return statusAluno;
	}
	/**
	 * @param statusAluno the statusAluno to set
	 */
	public void setStatusAluno(int statusAluno) {
		this.statusAluno = statusAluno;
	}
	/**
	 * @return the endereco
	 */
	public EnderecoBean getEndereco() {
		return endereco;
	}
	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(EnderecoBean endereco) {
		this.endereco = endereco;
	}
	/**
	 * @return the modalidades
	 */
	public ArrayList<ModalidadesBean> getModalidades() {
		return modalidades;
	}
	
	/**
	 * @return the plano
	 */
	public PlanoBean getPlano() {
		return plano;
	}
	/**
	 * @param plano the plano to set
	 */
	public void setPlano(PlanoBean plano) {
		this.plano = plano;
	}
	
	
			
}

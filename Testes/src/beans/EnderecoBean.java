package beans;

public class EnderecoBean {
	
	// Atributos
	
	private String cep;
	private String logradouro;
	private String nomeDaRua;
	private String bairro;
	private String cidade;
	private String estado;
	private String pais;
	
	public EnderecoBean(){
		
	}
	
	public EnderecoBean(String cep, String logradouro, String nomeDaRua, String bairro, String cidade, String estado, String pais){
		this.cep = cep;
        this.logradouro = logradouro;
        this.nomeDaRua = nomeDaRua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
	}
	
	// Metodos
	
	/**
	 * @return the cep
	 */
	public String getCep() {
		return cep;
	}
	/**
	 * @param cep the cep to set
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}
	/**
	 * @return the logradouro
	 */
	public String getLogradouro() {
		return logradouro;
	}
	/**
	 * @param logradouro the logradouro to set
	 */
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	/**
	 * @return the nomeDaRua
	 */
	public String getNomeDaRua() {
		return nomeDaRua;
	}
	/**
	 * @param nomeDaRua the nomeDaRua to set
	 */
	public void setNomeDaRua(String nomeDaRua) {
		this.nomeDaRua = nomeDaRua;
	}
	/**
	 * @return the bairro
	 */
	public String getBairro() {
		return bairro;
	}
	/**
	 * @param bairro the bairro to set
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	/**
	 * @return the cidade
	 */
	public String getCidade() {
		return cidade;
	}
	/**
	 * @param cidade the cidade to set
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}
	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	

}

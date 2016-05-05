package br.com.menuInicial;

/**
 * @author Augusto
 * 
 * Bean da pagina de Menu Inicial
 *
 * Status: Em desenvolvimento
 * 
 * TODO - Desenvolver Pagina de Menu inicial
 * 
 */
public class MenuInicialBean {
	
	private String componente = "";
	private final String TITLE = "Renan Fight Team!";
	
	/**
	 * 
	 * Metodos do bean 
	 * 
	 */
	
	public String getComponente() {
		return componente;
	}
	public void setComponente(String componente) {
		this.componente = componente;
	}
	public String getTITLE() {
		return TITLE;
	}
	
}

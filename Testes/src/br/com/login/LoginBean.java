/**
 * 
 */
package br.com.login;

import br.com.parametros.TitlePagesEnum;

/**
 * @author Augusto
 * 
 * Bean da pagina de Login
 *
 * Status: Concluido
 */

public class LoginBean {
	
	private String idUsuario;
    private String senha;
    private final String TITLE = TitlePagesEnum.LOGIN_TITLE.getTitle();
    
	/**
	 * @return the idUsuario
	 */
	public String getIdUsuario() {
		return idUsuario;
	}
	/**
	 * @param idUsuario the idUsuario to set
	 */
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}
	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getTITLE() {
		return TITLE;
	}
    
	
        

}

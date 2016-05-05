package br.com.login;

import java.io.IOException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import br.com.messages.MessagesEnum;
import br.com.messages.MessagesErrorImp;
import br.com.parametros.PaginasEnum;
import model.Usuarios;

/**
 * 
 * Classe Implemetação do Login
 * 
 * Camada de lógica da fase de login
 * 
 * Status: Concluido
 *
 */
@RequestScoped
@ManagedBean
public class LoginImpl {

	// Queries
	private final String CONSULTA_USUARIO = "from Usuarios where idUsuario = :idUsuario";
	
	// Parametro Queries	
	private final String PARM = "idUsuario";
	
	// Objetos
	private LoginBean loginBean = new LoginBean();

	// Validar usuário e senha
	public void validarLogin() {

		// Valida campos de entrada
		if (validarCampoUsuario()) {
			if (validarCampoSenha()) {

				LoginDataBases ldb = new LoginDataBases();

				// Verifica se usuário foi encontrado no sistema
				try {
					Usuarios usuario = (Usuarios) (ldb.buscaUsuario(
							CONSULTA_USUARIO, PARM, loginBean.getIdUsuario()));

					// Valida dados informados com o recuperado pelo banco de
					// dados

					if ((loginBean.getIdUsuario()
							.equals(usuario.getIdUsuario()))
							&& (loginBean.getSenha().equals(usuario.getSenha()))) {
						// Redireciona para pagina inicial do sistema
						redirectPaginaInicial();
					} else {
						TratarMessagemErro(MessagesEnum.ERROR_USUARIO_SENHA_INVALIDO);
					}
					
				} catch (NullPointerException error) {
					TratarMessagemErro(MessagesEnum.ERROR_USUARIO_SENHA_INVALIDO);
				}
			}
		}
	}

	
	// Validar preenchimento do campo usuário
	private boolean validarCampoUsuario() {
		boolean usuarioPreenchido = false;

		if ((loginBean.getIdUsuario().equals(""))
				|| (loginBean.getIdUsuario().equals(null))) {
			TratarMessagemErro(MessagesEnum.INFO_USUARIO_NAO_INFORMADO);
		} else {
			usuarioPreenchido = true;
		}

		return usuarioPreenchido;
	}

	
	// Validar preenchimento do campo Senha
	private boolean validarCampoSenha() {

		boolean senhaPreenchido = false;

		if ((loginBean.getSenha().equals(""))
				|| (loginBean.getSenha().equals(null))) {
			TratarMessagemErro(MessagesEnum.INFO_SENHA_NAO_INFORMADA);
		} else {
			senhaPreenchido = true;
		}

		return senhaPreenchido;
	}

	
	// Redirect para pagina inicial do sistema
	private void redirectPaginaInicial() {
		try {
			FacesContext.getCurrentInstance().getExternalContext()
					.redirect(PaginasEnum.MENU_INICIAL_RED.getPagina());
		} catch (IOException e) {
			TratarMessagemErro(MessagesEnum.FATAL_ERROR_REDIRECT_PAGE);
		}
	}

	
	// **********************
	// Getter and Setters //
	// **********************
	public LoginBean getLoginBean() {
		return loginBean;
	}

	public void setLoginBean(LoginBean loginBean) {
		this.loginBean = loginBean;
	}

	// Método de tratamento de erro
	private void TratarMessagemErro(MessagesEnum me) {
		MessagesErrorImp mei = new MessagesErrorImp();

		mei.setMessageEnum(me);
		mei.tratarMensagemErro();

	}

}

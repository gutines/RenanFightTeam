package br.com.messages;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.omg.CORBA.DATA_CONVERSION;

/**
 * 
 * Classe de tratamento de mensagens de erro
 *
 * Status: Em desenvolvimento
 *
 */
public class MessagesErrorImp {

	// Varivaeis de trabalho
	private final int INFO = 1;
	private final int WARN = 2;
	private final int ERROR = 3;
	private final int FATAL_ERROR = 4;
	private final int DATA_BASES_ERROR = 5;
	
	// Atributos do Objeto	
	MessagesEnum messageEnum;
	
	/**
	 * 
	 * Parâmetros: - Inteiro: indicador de severidade: 1) INFORMATIVO; 2)
	 * ALERTA; 3) ERRO; 4) ERRO_FATAL; 5) DATA_BASES_ERROR.
	 */

	// Direciona para qual tratamento de erro
	public void tratarMensagemErro() {
		
		// Direcionamento para o tipo de severidade do erro.
		switch (messageEnum.getSeveriry()) {
		
			// Tramento de informativo
			case INFO:
				infoMessage();
				break;
		
				// Tramento de alerta
			case WARN:
				warningMessage();
				break;
				
				// Tramento de erro
			case ERROR:							
				errorMessage();
				break;
				
				// Tramento de erro fatal				
			case FATAL_ERROR:
				fatalErrorMessage();
				break;
				
				// Tratamento de erro de Banco de Dados
			case DATA_BASES_ERROR:
				dataBasesErrorMessage();
				break;
			
		}
	}

	private void infoMessage() {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, messageEnum.getTypeError(), messageEnum.getDescError());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	private void warningMessage() {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_WARN, messageEnum.getTypeError(), messageEnum.getDescError());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	private void errorMessage() {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, messageEnum.getTypeError(), messageEnum.getDescError());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	private void fatalErrorMessage() {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_FATAL, messageEnum.getTypeError(), messageEnum.getDescError());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	private void dataBasesErrorMessage() {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_FATAL, messageEnum.getTypeError(), messageEnum.getDescError());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	public void setMessageEnum(MessagesEnum me) {
		this.messageEnum = me;
	}

}

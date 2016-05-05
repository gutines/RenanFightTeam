package br.com.messages;

public enum MessagesEnum {
	/**
	 * Classe de constantes de mensagens e tratamento de erro
	 * 
	 * Par�metros:	
	 * 	- Inteiro: indicador de severidade:
	 * 		1) INFORMATIVO;
	 * 		2) ALERTA;
	 * 		3) ERRO;
	 * 		4) ERRO_FATAL.
	 * 		5) DATA_BASES_ERROR
	 * 
	 * 	- String: indicador do tipo de erro:
	 * 		Erro de Consist�ncia: Erro na valida��o de campos e consist�ncia de valores;
	 * 		Erro de Sistema: Erro de sistema, ex: no redirecionameto de pagina;
	 * 		
	 * 	- String: descri�ao do erro:
	 * 		Descri��o do erro ocorrido.
	 */

	// Constantes
	INFO_USUARIO_NAO_INFORMADO (1, "Erro de consist�ncia", "Usu�rio n�o informado!"),
	INFO_SENHA_NAO_INFORMADA (1, "Erro de consist�ncia", "Senha n�o informada!"),
	ERROR_USUARIO_SENHA_INVALIDO (3, "Erro de Valida��o", "Usu�rio ou Senha inv�lidos!"),
	FATAL_ERROR_REDIRECT_PAGE(4, "System Error", "Problemas ao redirecionar a pagina!/nTente novamente em alguns instantes."),
	DATA_BASES_ERROR_DATA_BASES(5,"Data Bases Error", "Problemas ao obter a sess�o do Banco de Dados!");
	
	// Atributos do Enum
	private final int severiry;
	private final String typeError;
	private final String descError;
	
	
	private MessagesEnum(int severiry, String typeError, String descError) {
		this.severiry = severiry;
		this.typeError = typeError;
		this.descError = descError;
	}

	public int getSeveriry() {
		return severiry;
	}


	public String getTypeError() {
		return typeError;
	}


	public String getDescError() {
		return descError;
	}
	
		
	
}

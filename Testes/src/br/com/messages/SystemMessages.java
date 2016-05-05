package br.com.messages;

public enum SystemMessages {
	
	ERROR_REDIRECT_PAGE(1, "System Error", "Problemas ao redirecionar a pagina!/nTente novamente em alguns instantes.");

	private final int severity;
	private final String typeSystemError;
	private final String descSystemError;
	
	private SystemMessages(int severity, String typeSystemError,
			String descSystemError) {
		this.severity = severity;
		this.typeSystemError = typeSystemError;
		this.descSystemError = descSystemError;
	}

	public int getSeverity() {
		return severity;
	}

	public String getTypeSystemError() {
		return typeSystemError;
	}

	public String getDescSystemError() {
		return descSystemError;
	}
	
	

	
}

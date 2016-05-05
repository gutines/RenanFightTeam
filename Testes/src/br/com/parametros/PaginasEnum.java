package br.com.parametros;

/**
 * 
 * Classe ENUM para todos os componentes e paginas 
 *
 */
public enum PaginasEnum {
	
	MENU_INICIAL_RED ("paginas/renanfightteam.jsf"),
	ALUNO_NOVO_COMP ("/paginas/alunos/alunonovo.xhtml"),
	LOGIN_PAGE_RED("http://localhost:8080/Testes/index.jsf"),
	INITIAL_PAGE("");
	
	private final String pagina;

	private PaginasEnum(String pagina) {
		this.pagina = pagina;
	}

	public String getPagina() {
		return pagina;
	}
}

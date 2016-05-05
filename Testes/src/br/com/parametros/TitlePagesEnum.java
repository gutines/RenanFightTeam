package br.com.parametros;

public enum TitlePagesEnum {
	LOGIN_TITLE ("Login");

	private final String title;
	
	private TitlePagesEnum(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}


}

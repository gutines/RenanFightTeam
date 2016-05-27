package br.com.parametros;

public class StatusUtil {
	
	private StatusGeralDAO dao = new StatusGeralDAO();

	public StatusGeralDAO getDao() {
		return dao;
	}

	public void setDao(StatusGeralDAO dao) {
		this.dao = dao;
	}
	

}

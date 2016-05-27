package br.com.parametros;

import hibernate.DataBasesExecute;

public class StatusGeralDb extends DataBasesExecute{
	
	private final String HQL_CONSULTA_STATUS = "from Statusgeral where idStatus = :status";
	private final String PARM_STATUS = "status";

	public String getHQL_CONSULTA_STATUS() {
		return HQL_CONSULTA_STATUS;
	}
	
	public String getPARM_STATUS() {
		return PARM_STATUS;
	}
	
	

}

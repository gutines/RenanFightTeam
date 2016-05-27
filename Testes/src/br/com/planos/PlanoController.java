package br.com.planos;

import java.util.ArrayList;
import java.util.Iterator;

import model.Planos;

/************************************************************************
 * *
 * 
 * @author Augusto * * Class Name: PlanoController * * Objetivo: Responsável por
 *         todo o controle de planos * Tratar e retornar a lista de planos * *
 *         Status: Em desenvolvimento * * *
 ************************************************************************
 *         Alterações * * * * *
 ************************************************************************/
public class PlanoController {

	private Planos planoContratado = new Planos();
	private ArrayList<Planos> listaDePlanos = new ArrayList<Planos>();
	private PlanosDAO dao;
	
	
	public PlanoController(){
		
		dao = new PlanosDAO();
		
		carregarPlanos();
				
	}
	

	private void carregarPlanos() {
		
		listaDePlanos = dao.listarPlanos();
		
	}

	
	public PlanosDAO getDao() {
		return dao;
	}

	
	public void setDao(PlanosDAO dao) {
		this.dao = dao;
	}


	public ArrayList<Planos> getListaDePlanos() {
		return listaDePlanos;
	}


	public void setListaDePlanos(ArrayList<Planos> listaDePlanos) {
		this.listaDePlanos = listaDePlanos;
	}


	public Planos getPlanoContratado() {
		return planoContratado;
	}


	public void setPlanoContratado(Planos planoContratado) {
		this.planoContratado = planoContratado;
	}

}

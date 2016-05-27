package br.com.modalidades;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;

import model.Alunos;
import model.Modalidades;
import model.Modalidadescontratadas;
import model.ModalidadescontratadasId;

/************************************************************************
 *                                                                      *
 * @author Augusto                                                      *
 *                                                                      *
 *	Class Name: ModalidadeController                                    *
 *	                                                                    *
 *	Objetivo: Responsável por todo o controle de modalidade             *
 *	          Tratar e retornar a lista de modalidade                   *
 *	                                                                    *
 *	Status: Em desenvolvimento                                          *
 *	                                                                    *
 *	                                                                    *
 ************************************************************************
 *  Alterações                                                          *
 *	                                                                    *
 *	                                                                    *
 *	                                                                    *
 *	                                                                    * 
 ************************************************************************/

public class ModalidadesController {
		
	private ArrayList<Modalidades> listaDeModalidades = new ArrayList<Modalidades>();
	private ArrayList<Modalidades> modalidadesContratadas = new ArrayList<Modalidades>();
	private ModalidadeDAO dao;
	
		
	public ModalidadesController(){	
		dao = new ModalidadeDAO();
		
		listaDeModalidades = dao.listarModalidades();
	}
	
	
	public void atrelarModalidade(Alunos aluno){
		
		for (Iterator iterator = modalidadesContratadas.iterator(); iterator
				.hasNext();) {
			
			Modalidades modalidades = (Modalidades) iterator.next();
						
			
			ModalidadescontratadasId mcid = new ModalidadescontratadasId(
					modalidades.getIdModalidade(), aluno.getIdAlunos());
			

			Modalidadescontratadas mc = new Modalidadescontratadas();

			Date data = new java.sql.Date(new java.util.Date().getTime());

			mc.setId(mcid);
			mc.setDataDeContratacao(data);

			dao.atrelarModalidade(mc);
			
		}
		
		dao.comitar();
	}
	
	public ModalidadeDAO getDao() {
		return dao;
	}


	public void setDao(ModalidadeDAO dao) {
		this.dao = dao;
	}


	public ArrayList<Modalidades> getListaDeModalidades() {
		return listaDeModalidades;
	}


	public void setListaDeModalidades(ArrayList<Modalidades> listaDeModalidades) {
		this.listaDeModalidades = listaDeModalidades;
	}


	public void setModalidadesContratadas(
			ArrayList<Modalidades> modalidadesContratadas) {
		this.modalidadesContratadas = modalidadesContratadas;
	}


	public ArrayList<Modalidades> getModalidadesContratadas() {
		return modalidadesContratadas;
	}
	
}

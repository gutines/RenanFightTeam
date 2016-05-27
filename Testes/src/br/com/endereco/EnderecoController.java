package br.com.endereco;

import java.util.Formatter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import model.Endereco;

/************************************************************************
 * *
 * 
 * @author Augusto * * Class Name: EnderecoController * * Objetivo: Classe
 *         responsável pelo tratamento do endereco, como * recuperar e tratar os
 *         dados. * * Status: Em desenvolvimento * * *
 ************************************************************************
 *         Alterações * * * * *
 ************************************************************************/

public class EnderecoController {

	private Endereco endereco = new Endereco();
	private EnderecoDAO dao = new EnderecoDAO();

	private String cep;

	public EnderecoController() {
		endereco = new Endereco();
		dao = new EnderecoDAO();
	}

	public void bucarEnderecoCep() {
		carregarEndereco();
	}

	private void carregarEndereco() {

		endereco = dao.buscarEnderecoCep(getCep());

	}

	public EnderecoDAO getDao() {
		return dao;
	}

	public void setDao(EnderecoDAO dao) {
		this.dao = dao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

}

package br.com.alunos.filtroDePesquisa;

import java.io.IOException;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.alunos.AlunoController;
import br.com.parametros.PaginasEnum;
import br.com.parametros.TipoPesquisaEnum;
import model.Alunos;

@ManagedBean
@ViewScoped
public class FiltroAlunoController {

	private TipoPesquisaEnum tipoDePesquisa;
	private AlunoController alunoController;

	private String valorPesquisa;
	private boolean showResultTable;

	public FiltroAlunoController() {

		showResultTable = false;
		alunoController = new AlunoController();

	}

	public void pesquisar() {

		switch (getTipoDePesquisa()) {

		case PESQUISA_ID:
			consultaPorIdAluno();
			break;

		case PESQUISA_NOME:
			consultaPorNome();
			break;

		case PESQUISA_CPF:
			consultaPorCpf();
			break;

		}

		setShowResultTable(true);
	}

	public void cancelar() {

		try {
			FacesContext.getCurrentInstance().getExternalContext()
					.redirect(PaginasEnum.MENU_INICIAL_COMP.getPagina());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void consultaPorIdAluno() {

		alunoController.setAlunoLista(alunoController.getDao().filtrarPorId(
				valorPesquisa));

	}

	private void consultaPorNome() {

		alunoController.setAlunoLista(alunoController.getDao().filtrarPorNome(
				valorPesquisa));

	}

	private void consultaPorCpf() {

		alunoController.setAlunoLista(alunoController.getDao().filtrarPorCpf(
				valorPesquisa));

	}

	public TipoPesquisaEnum[] getListaTipoDePesquisa() {
		return TipoPesquisaEnum.values();
	}

	public TipoPesquisaEnum getTipoDePesquisa() {

		return tipoDePesquisa;
	}

	public void setTipoDePesquisa(TipoPesquisaEnum tipoDePesquisa) {

		this.tipoDePesquisa = tipoDePesquisa;
	}

	public String getValorPesquisa() {

		return valorPesquisa;
	}

	public void setValorPesquisa(String valorPesquisa) {

		this.valorPesquisa = valorPesquisa;
	}

	public boolean isShowResultTable() {
		return showResultTable;
	}

	public void setShowResultTable(boolean showResultTable) {
		this.showResultTable = showResultTable;
	}

	public AlunoController getAlunoController() {

		return alunoController;
	}

	public void setAlunoController(AlunoController alunoController) {

		this.alunoController = alunoController;
	}

}

package beans;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

import br.com.parametros.TipoPesquisaEnum;
import model.Alunos;

@ManagedBean(name = "filtroPesquisaAlunoBean")
public class FiltroPesquisaAlunoBean {

	private TipoPesquisaEnum tipoPesquisaEnum;
	private String valorPesquisa;
	private ArrayList<Alunos> alunoLista = new ArrayList<Alunos>();

	public TipoPesquisaEnum[] getTipoPesquisas() {
		return TipoPesquisaEnum.values();
	}

	/**
	 * Setters and Getters
	 */
	public TipoPesquisaEnum getTipoPesquisa() {
		return tipoPesquisaEnum;
	}

	public void setTipoPesquisa(TipoPesquisaEnum tipoPesquisaEnum) {
		this.tipoPesquisaEnum = tipoPesquisaEnum;
	}

	public String getValorPesquisa() {
		return valorPesquisa;
	}

	public void setValorPesquisa(String valorPesquisa) {
		this.valorPesquisa = valorPesquisa;
	}

	public ArrayList<Alunos> getAlunoLista() {
		return alunoLista;
	}

	public void setAlunoLista(ArrayList<Alunos> alunoLista) {
		this.alunoLista = alunoLista;
	}

}

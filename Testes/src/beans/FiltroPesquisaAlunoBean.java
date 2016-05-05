package beans;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

import br.com.alunos.TipoPesquisa;
import model.Alunos;

@ManagedBean(name = "filtroPesquisaAlunoBean")
public class FiltroPesquisaAlunoBean {
	
	private TipoPesquisa tipoPesquisa;
	private String valorPesquisa;
	private ArrayList<Alunos> alunoLista = new ArrayList<Alunos>();
	
	
	public TipoPesquisa[] getTipoPesquisas(){
		return TipoPesquisa.values();
	}
	
	/**
	 * Setters and Getters
	 */
	public TipoPesquisa getTipoPesquisa() {
		return tipoPesquisa;
	}
	
	public void setTipoPesquisa(TipoPesquisa tipoPesquisa) {
		this.tipoPesquisa = tipoPesquisa;
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

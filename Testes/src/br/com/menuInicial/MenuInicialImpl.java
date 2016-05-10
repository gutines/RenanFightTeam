package br.com.menuInicial;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.alunos.alunoNovo.AlunoNovoImpl;
import br.com.parametros.PaginasEnum;

/**
 * 
 * @author Augusto
 *
 *	Classe de implementação da pagina de Menu Inicial
 *	
 *	Esta classe é responsável por receber a solicitação do usuário
 *	e apresentar o componente solicitado
 *
 *	Status: Em desenvolvimento
 *		Atividades TODO MenuInicialImpl: Desenvolver as chamadas das paginas e tratamentos
 */

@ManagedBean
@ViewScoped
public class MenuInicialImpl implements java.io.Serializable {
	
	private MenuInicialBean menuInicialBean = new MenuInicialBean();
	
	// Testes
	
	private String componente = "";
	
	
//	@PostConstruct
//	public void init(){
//		System.out.println("Pagina: " + menuInicialBean.getComponente());
//		menuInicial();
//	}

	/**
	 * Metodos de controle dos componentes incorporados a pagina
	 */
	
	public void menuInicial(){
		componente = PaginasEnum.INITIAL_PAGE.getPagina();
	}
	
	public void alunoNovo() {
		componente = PaginasEnum.ALUNO_NOVO_COMP.getPagina();

	}
		
	public void voltar(){
		menuInicial();
	}
		
	public String quit(){
		menuInicial();
		return PaginasEnum.LOGIN_PAGE_RED.getPagina();
	}

	/** 
	 *
	 *	Metodos Getters and Setters
	 * 
	 */
	
	public MenuInicialBean getMenuInicialBean() {
		return menuInicialBean;
	}

	public void setMenuInicialBean(MenuInicialBean menuInicialBean) {
		this.menuInicialBean = menuInicialBean;
	}

	public String getComponente() {
		return componente;
	}

	

}

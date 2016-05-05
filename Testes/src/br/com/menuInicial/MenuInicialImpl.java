package br.com.menuInicial;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.alunos.AlunoNovoImpl;
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
@SessionScoped
public class MenuInicialImpl {
	
	private MenuInicialBean menuInicialBean = new MenuInicialBean();
	private AlunoNovoImpl alunoNovoImpl;
	
	@PostConstruct
	public void init(){
		System.out.println("Pagina: " + menuInicialBean.getComponente());
//		menuInicial();
	}

	/**
	 * Metodos de controle dos componentes incorporados a pagina
	 */
	
	public void menuInicial(){
		menuInicialBean.setComponente(PaginasEnum.INITIAL_PAGE.getPagina());
	}
	
	public void novoAluno(){
		alunoNovoImpl = new AlunoNovoImpl();
		menuInicialBean.setComponente(PaginasEnum.ALUNO_NOVO_COMP.getPagina());
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

	public AlunoNovoImpl getAlunoNovoImpl() {
		return alunoNovoImpl;
	}

	public void setAlunoNovoImpl(AlunoNovoImpl alunoNovo) {
		this.alunoNovoImpl = alunoNovo;
	}

}

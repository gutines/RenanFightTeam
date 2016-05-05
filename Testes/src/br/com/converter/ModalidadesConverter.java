package br.com.converter;

import hibernate.HibernateUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import org.hibernate.Query;
import org.hibernate.Session;
import model.Modalidades;

/**
 * @author Augusto Converter do Objeto Modalidade
 */

@FacesConverter(value = "modalidadesConverter", forClass = Modalidades.class)
public class ModalidadesConverter implements Converter {

	private Map<String, Modalidades> modalidades = new HashMap<String, Modalidades>();

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		carregaMap();
		
		return modalidades.get(arg2);
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
				
		String modalidadeDesc = ((Modalidades) arg2).getDescricaoModalidade();
		return modalidadeDesc;
	}

	// Recupera mapa do objeto
	public Map<String, Modalidades> getModalidades() {
		return modalidades;
	}
	
	// Metodo para carregar o Map
	private void carregaMap(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		Query q = session.createQuery("from Modalidades");
		
		
		ArrayList<Modalidades> modalidadeList = ((ArrayList<Modalidades>) q.list());
		
		for (Iterator iterator = modalidadeList.iterator(); iterator.hasNext();) {
			Modalidades auxModalidade = (Modalidades) iterator.next();
			
			modalidades.put(auxModalidade.getDescricaoModalidade(), auxModalidade);
		}		
	}
}

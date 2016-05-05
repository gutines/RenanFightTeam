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
import model.Planos;

@FacesConverter(value = "planosConverter", forClass = Planos.class)
public class PlanosConverter implements Converter {

	private Map<String, Planos> planos = new HashMap<String, Planos>();

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		carregaMap();
		
		return planos.get(arg2);
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {

		String planosDesc = ((Planos) arg2).getPlanoDescricao();
		return planosDesc;
	}

	// Recupera mapa do objeto
	public Map<String, Planos> getPlanos() {
		return planos;
	}

	// Metodo para carregar o Map
	private void carregaMap() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		Query q = session.createQuery("from Planos");

		ArrayList<Planos> planosList = (ArrayList<Planos>) q.list();

		for (Iterator iterator = planosList.iterator(); iterator.hasNext();) {
			Planos auxPlanos = (Planos) iterator.next();

			planos.put(auxPlanos.getPlanoDescricao(), auxPlanos);
		}
	}

}

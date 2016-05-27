package hibernate;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;

import br.com.messages.MessagesEnum;
import br.com.messages.MessagesErrorImp;


// TODO Excluir Classe Descontinuada
public class DataBasesExecute {

	private Session session;

	// Constructor
	public DataBasesExecute() {
		session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
	}

	public Object consultaParametro(String hql, String parm, String parmValue) {
		Query q = getSession().createQuery(hql);
		q.setParameter(parm, parmValue);

		return q.uniqueResult();

	}

	// Retorna lista de objeto
	public <E> ArrayList<E> retornarLista(String hql) {
		Query q = getSession().createQuery(hql);

		return (ArrayList<E>) q.list();

	}

	public void comitar() {
		getSession().getTransaction().commit();
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public void tratarErro(MessagesEnum me){
		MessagesErrorImp mei = new MessagesErrorImp();
		
		mei.setMessageEnum(me);
		mei.tratarMensagemErro();
	}
}

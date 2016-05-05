package hibernate;

import org.hibernate.Session;

public class DataBasesExecute {
	
	private Session session;
	
	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	// Constructor
	public DataBasesExecute() {
		session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
	}
	
	
	
	
	

}

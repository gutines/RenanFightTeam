package hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.com.messages.MessagesEnum;
import br.com.messages.MessagesErrorImp;

public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            return new Configuration().configure().buildSessionFactory();
        }
        catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
        	MessagesErrorImp mei = new MessagesErrorImp();
        	
        	mei.setMessageEnum(MessagesEnum.DATA_BASES_ERROR_DATA_BASES);
        	mei.tratarMensagemErro();
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}

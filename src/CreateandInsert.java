import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateandInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config = new Configuration();
		config.configure();
		SessionFactory sf = config.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Hibernate_CRUD h1 = new Hibernate_CRUD();
		h1.setCid(1);
		h1.setCname("AMULYA");
		h1.setAdress("ONGOLE");
		s.save(h1);
		tx.commit();
		System.out.println("..................");
		s.close();
   
		

	}
}
     
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Start {
    public static void main(String[] args) {
        Book b = new Book();
        b.setId(3);
        b.setName("fxlkf");
        b.setDescription("*****");


        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(b);
        session.getTransaction().commit();
    }
}

import entity.UserData;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Query query = session.createQuery("from UserData u where u.email like :text");
        query.setParameter("text", "%a%");

        List<UserData> users = query.getResultList();
        //Query query = session.createQuery("from User u where u.id = :text", User.class);

        session.close();
        HibernateUtil.close();
    }
}

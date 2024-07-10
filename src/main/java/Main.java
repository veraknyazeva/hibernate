import entity.UserData;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;


public class Main {

    public static void main(String[] args) {


        Session session = HibernateUtil.getSessionFactory().openSession();

//        UserData userData = session.get(UserData.class, 10_025L);
//        System.out.println(userData.getStat());

        Query<UserData> query = session.createQuery("from UserData ");
        query.setMaxResults(2);

        List<UserData> userData = query.getResultList();
        System.out.println(userData.get(0).getRoles());


        session.close();
        HibernateUtil.close();
    }
}

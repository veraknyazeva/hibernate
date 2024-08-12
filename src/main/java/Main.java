import entity.UserData;
import org.hibernate.Session;


public class Main {

    public static void main(String[] args) {


        Session session = HibernateUtil.getSessionFactory().openSession();

        UserData u1 = session.get(UserData.class, 10025L);
        System.out.println(u1);

        session = HibernateUtil.getSessionFactory().openSession();
        UserData u2 = session.get(UserData.class, 10025L);
        System.out.println(u1);

        session.close();
        HibernateUtil.close();
    }
}

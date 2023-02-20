package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.Query;
import java.util.List;

public class UserDaoHibernateImpl implements UserDao {
    private String sql;
    private SessionFactory sessionFactory = Util.getSessionFactory();;

    public UserDaoHibernateImpl() {
    }

    @Override
    public void createUsersTable() {
        try (Session session = sessionFactory.openSession()) {

            sql = "CREATE TABLE IF NOT EXISTS users " +
                    "(id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY, " +
                    "name VARCHAR(255) NOT NULL, " +
                    "lastName VARCHAR(255) NOT NULL, " +
                    "age INT(3) NOT NULL)";

            session.beginTransaction();
            session.createSQLQuery(sql).addEntity(User.class).executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void dropUsersTable() {
        try (Session session = sessionFactory.openSession()) {

            sql = "DROP TABLE IF EXISTS users";

            session.beginTransaction();
            session.createSQLQuery(sql).executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        try (Session session = sessionFactory.openSession()) {

            User user = new User(name, lastName, age);

            session.beginTransaction();
            session.save(user);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void removeUserById(long id) {
        try (Session session = sessionFactory.openSession()) {

            sql = "DELETE FROM users WHERE id = " + id;

            session.beginTransaction();
            session.createSQLQuery(sql).executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<User> getAllUsers() {
        try (Session session = sessionFactory.openSession()) {

            sql = "SELECT e FROM User e";

            Query query = session.createQuery(sql);
            return query.getResultList();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void cleanUsersTable() {
        try (Session session = sessionFactory.openSession()) {

            sql = "TRUNCATE TABLE users";

            session.beginTransaction();
            session.createSQLQuery(sql).executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

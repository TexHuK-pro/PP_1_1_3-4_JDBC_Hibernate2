package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;


public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        //UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();

        //добавить пользователя Hibernate
        //userDaoHibernate.saveUser("test1253", "test15", (byte) 840);
        //userDaoHibernate.saveUser("test123", "tes235", (byte) 8033);
        //userDaoHibernate.saveUser("test3", "tes35", (byte) -80);
        //userDaoHibernate.saveUser("test13", "test35", (byte) 000);

        //показать пользователей
        //System.out.println(userDaoHibernate.getAllUsers());

        //Удалить пользователя по ID Hibernate
        //userDaoHibernate.removeUserById(3);

        //Удалить всех пользователей Hibernate
        //userDaoHibernate.cleanUsersTable();

        //удалить таблицу Hibernate
        //userDaoHibernate.dropUsersTable();

        //создать таблица Hibernate
        //userDaoHibernate.createUsersTable();

        //---------------------------------------------------------

        // создать таблицу
        //userDaoJDBC.createUsersTable();

        // Добавление User в таблицу
        //userDaoJDBC.saveUser("Вася","Иванов", (byte) 34);
        //userDaoJDBC.saveUser("Алеша","Попович", (byte) 345);
        //userDaoJDBC.saveUser("Добрыня","Super", (byte) -5);
        //userDaoJDBC.saveUser("Василиса","Super", (byte) 1111);
        //userDaoJDBC.saveUser("User5","Super", (byte) 90);

        // Получение всех User(ов) из таблицы
        //System.out.println(userDaoJDBC.getAllUsers());

        // Очистка таблицы
        //userDaoJDBC.cleanUsersTable();

        // удалить таблицу
        //userDaoJDBC.dropUsersTable();

        // Удаление User из таблицы ( по id )
        //userDaoJDBC.removeUserById(2);

    }
}

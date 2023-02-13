package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;


public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();

        // создать таблицу
        //userDaoJDBC.createUsersTable();

        // Добавление User в таблицу
        //userDaoJDBC.saveUser("Вася","Иванов", (byte) 34);
        //userDaoJDBC.saveUser("Алеша","Попович", (byte) 345);
        //userDaoJDBC.saveUser("Добрыня","Super", (byte) -5);
        //userDaoJDBC.saveUser("Василиса","Super", (byte) 1111);
        //userDaoJDBC.saveUser("User5","Super", (byte) 90);

        // Получение всех User(ов) из таблицы
        System.out.println(userDaoJDBC.getAllUsers());

        // Очистка таблицы
        //userDaoJDBC.cleanUsersTable();

        // удалить таблицу
        //userDaoJDBC.dropUsersTable();

        // Удаление User из таблицы ( по id )
        //userDaoJDBC.removeUserById(2);

    }
}

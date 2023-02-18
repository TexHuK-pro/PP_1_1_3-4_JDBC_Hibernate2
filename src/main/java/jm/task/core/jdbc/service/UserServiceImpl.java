package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    //private UserDaoJDBCImpl userService = new UserDaoJDBCImpl();
    UserDaoHibernateImpl userService = new UserDaoHibernateImpl();
    public void createUsersTable() {
        userService.createUsersTable();
    }

    public void dropUsersTable() {
        userService.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userService.saveUser(name,lastName,age);
    }

    public void removeUserById(long id) {
        userService.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    public void cleanUsersTable() {
        userService.cleanUsersTable();
    }
}

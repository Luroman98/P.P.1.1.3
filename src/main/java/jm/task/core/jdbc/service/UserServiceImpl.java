package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao serDaoJdbcImpl = new UserDaoJDBCImpl();

    public void createUsersTable() throws SQLException, ClassNotFoundException {
        serDaoJdbcImpl.createUsersTable();
    }

    public void dropUsersTable() throws SQLException, ClassNotFoundException {
        serDaoJdbcImpl.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException, ClassNotFoundException {
        serDaoJdbcImpl.saveUser(name, lastName, age);
    }
    public void removeUserById(long id) throws SQLException, ClassNotFoundException {
        serDaoJdbcImpl.removeUserById(id);
    }

    public List<User> getAllUsers() throws SQLException, ClassNotFoundException {
        return serDaoJdbcImpl.getAllUsers();
        }

    public void cleanUsersTable() throws SQLException, ClassNotFoundException {
        serDaoJdbcImpl.cleanUsersTable();
    }
}

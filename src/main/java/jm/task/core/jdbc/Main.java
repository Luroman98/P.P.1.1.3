package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserService servis = new UserServiceImpl();
        servis.createUsersTable();
        User user = new User("Ivan", "Luk", (byte) 3);
        User user1 = new User("Roma", "Luk", (byte) 3);
        User user2 = new User("Ivan", "Luk", (byte) 3);
        User user3 = new User("Ivan", "Luk", (byte) 3);

        servis.saveUser(user.getName(), user.getLastName(), user.getAge());
        servis.saveUser(user1.getName(), user1.getLastName(), user1.getAge());
        servis.saveUser(user2.getName(), user2.getLastName(), user2.getAge());
        servis.saveUser(user3.getName(), user3.getLastName(), user3.getAge());

        //servis.dropUsersTable();

        //servis.removeUserById(1);

        //servis.cleanUsersTable();
        List<User> usersss = new ArrayList<>();
        usersss = servis.getAllUsers();
        usersss.forEach(x -> System.out.println(x));

    }

}

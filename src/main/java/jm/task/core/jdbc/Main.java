package jm.task.core.jdbc;

import antlr.Utils;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;
import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Алексей", "Смирнов", (byte) 18);
        userService.saveUser("Дмитрий", "Зуев", (byte) 45);
        userService.saveUser("Иван", "Иванов", (byte) 27);
        userService.saveUser("Владимир", "Корнилов", (byte) 25);

        userService.removeUserById(1);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}

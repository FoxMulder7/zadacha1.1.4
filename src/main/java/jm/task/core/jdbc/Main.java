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

        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();

        userDao.saveUser("Алексей", "Смирнов", (byte) 18);
        userDao.saveUser("Дмитрий", "Зуев", (byte) 45);
        userDao.saveUser("Иван", "Иванов", (byte) 27);
        userDao.saveUser("Владимир", "Корнилов", (byte) 25);

        userDao.removeUserById(1);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}

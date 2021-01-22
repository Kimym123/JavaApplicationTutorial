package se.hs.ac.module;

import se.hs.ac.dao.UserDao;
import se.hs.ac.dto.User;

import java.util.List;

public class CardModule {

    public void insertUser(String name, String phone, String company) {
        User user = new User(name, phone, company);

        UserDao dao = new UserDao();
        int insertCount = dao.addUser(user);
        System.out.println(insertCount);
    }

    public void outputUser() {
        UserDao dao = new UserDao();
        List<User> list = dao.getUsers();

        for (User user : list) {
            System.out.println(user);
        }
    }


}

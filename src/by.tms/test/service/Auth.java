package by.tms.test.service;

import by.tms.test.entity.User;
import by.tms.test.entity.UserBD;
import by.tms.test.util.ReaderImpl;

public class Auth {
    ReaderImpl reader = new ReaderImpl();

    public User doAuth(){
        System.out.println("Enter Login");
        String login = reader.input();

        return ;
    }
}

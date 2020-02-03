package by.tms.test.service;

import by.tms.test.action.ConsoleAppImpl;
import by.tms.test.entity.User;
import by.tms.test.util.ReaderImpl;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class Auth {
    public static void auth(){
        ReaderImpl reader = new ReaderImpl();
        ConsoleAppImpl app = new ConsoleAppImpl();
        ArrayList<User> users;

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("UserBD.txt"));
            users = (ArrayList) ois.readObject();
            ois.close();

            System.out.println("Enter Login");
            String login = reader.input();
            for (User user : users){
                if(login.equals(user.getLogin())){
                    System.out.println("Enter Password");
                    String pass = reader.input();
                    if (pass.equals(user.getPassword())){
                        System.out.println("Hello " + user.getLogin());
                    }
                }else {
                    System.out.println("Auth failed");
                    break;
                }
            }
            app.summoningDaCalc();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
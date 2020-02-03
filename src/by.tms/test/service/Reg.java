package by.tms.test.service;

import by.tms.test.entity.User;
import by.tms.test.util.ReaderImpl;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Reg {
    private static List<User> bd = new ArrayList<>();
    public static void newUser() {
        ReaderImpl reader = new ReaderImpl();
//        Scanner sc = new Scanner(System.in);
        System.out.println("Enter login");
        String login = reader.input();
        System.out.println("Enter pass");
        String pass = reader.input();
        bd.add(new User(login, pass));

        try {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream("UserBD.txt"));
            oos.writeObject(bd);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

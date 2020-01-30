package by.tms.test.service;


import by.tms.test.entity.User;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Auth {

    public static void auth(){
        System.out.println("Enter Login");
        Scanner login = new Scanner(System.in);
        login.nextLine();
        System.out.println("Enter Password");
        Scanner pass = new Scanner(System.in);
        pass.nextLine();

        ArrayList<User> users;

        try {

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("UserBD.txt"));

            users = (ArrayList) ois.readObject();

            ois.close();

            for (User user : users){
                System.out.println(user);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
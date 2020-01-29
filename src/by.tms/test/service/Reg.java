package by.tms.test.service;

import by.tms.test.entity.User;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reg {
    static List<User> bd = new ArrayList<>();
    public static void newUser() {
        String login = "User"+ User.getUserCounter();
        String pass = "1111";
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 1; i++) {
            switch (i){
                case 0:
                    System.out.print("Enter login");
                    login = sc.next();
//                        fileWriter.append(" Login: " + sc.nextLine()+ ", ");
                    break;
                case 1:
                    System.out.print("Enter password");
                    pass = sc.next();
//                        fileWriter.append("Password: " + sc.nextLine() + ";\n");
                    sc.close();
                    break;
            }
        }
        bd.add(new User(login, pass));
        try {
//            FileWriter fileWriter = new FileWriter("UserBD.txt",true);
            FileOutputStream fos = new FileOutputStream("UserBD.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(bd);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package by.tms.test.service;

import by.tms.test.entity.User;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reg {
    private static List<User> bd = new ArrayList<>();
    public static void newUser() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter login");
        String login = sc.nextLine();
        System.out.println("Enter pass");
        String pass = sc.nextLine();


//        for (int i = 0; i <= 1; i++) {
//            switch (i){
//                case 0:
//                    System.out.println("Enter login");
//                    //сделать условие
//                    Scanner sc = new Scanner(System.in);
//                    login = sc.nextLine();
////                        fileWriter.append(" Login: " + sc.nextLine()+ ", ");
//                    sc.close();
//                    break;
//                case 1:
//                    System.out.println("Enter password");
//                    //сделать условие
//                    Scanner sc2 = new Scanner(System.in);
//                    pass = sc2.nextLine();
////                        fileWriter.append("Password: " + sc.nextLine() + ";\n");
//                    sc2.close();
//                    break;
//            }
//        }
        bd.add(new User(login, pass));
        try {
//            FileWriter fileWriter = new FileWriter("UserBD.txt",true);
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("UserBD.txt"));
            oos.writeObject(bd);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

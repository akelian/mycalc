package by.tms.test.service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Reg {
    public static void newUser() {
        try {
            FileWriter fileWriter = new FileWriter("UserBD.txt",true);
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i <= 1; i++) {
                switch (i){
                    case 0:
                        System.out.print("Enter login");
                        fileWriter.append(" Login: " + sc.nextLine()+ ", ");
                        break;
                    case 1:
                        System.out.print("Enter password");
                        fileWriter.append("Password: " + sc.nextLine() + ";\n");
                        break;
//                    case 2:
//                        System.out.print("Enter username");
//                        fileWriter.append("Username: " + sc.nextLine() + ", ");
//                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

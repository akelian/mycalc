package by.tms.test.util;

import by.tms.test.entity.History;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;

public class WriterImpl {
    private static final String BAD = "Выходим";

    public static void outputFromFile(String filename) {
        try {
            FileReader fileReader = new FileReader("logs.txt");
            Scanner scan = new Scanner(fileReader);

            while (scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void output(double result) {
        System.out.println(result);
    }
    public static void outputBad() {
        System.out.println(BAD);
    }
}

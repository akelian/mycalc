package by.tms.test.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class WriterImpl {
    private static final String BAD = "Выходим";

    public static void outputFromFile(String filename) {
        try {
            FileReader fileReader = new FileReader(filename);
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

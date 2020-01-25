package by.tms.test.entity;

import by.tms.test.util.WriterImpl;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public final class History{
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
    private static Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    public static final String filename = "logs.txt";

    public static void add(String value) {
        try {
            FileWriter fw = new FileWriter(filename, true);
            fw.append(sdf.format(timestamp)).append(": ").append(value).append("\n");
            fw.close();

        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
    }

        public static void showLogs () {
            WriterImpl.outputFromFile(filename);
        }

    }


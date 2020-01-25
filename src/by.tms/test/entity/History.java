package by.tms.test.entity;

import by.tms.test.util.WriterImpl;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public final class History{
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
    private static Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//    private String strInter;
//    public static List<History> log = new ArrayList<>();


//    private History(String strInter) {
//        this.strInter = sdf.format(timestamp) + ": " + strInter;
//    }

//    @Override
//    public String toString() {
//        return strInter;
//    }

    public static void add(String value) {
        try {
            FileWriter fw = new FileWriter("logs.txt", true);
            fw.write(sdf.format(timestamp) + ": " + value);
//            System.out.println(value);
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
    }

//    public static void add(String value){
//        log.add(new History(value));
//    }
//
//        public static void showLogs () {
//            WriterImpl.outputLog();
//        }

    }


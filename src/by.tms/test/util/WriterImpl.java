package by.tms.test.util;

import by.tms.test.entity.History;

import java.util.Iterator;

public class WriterImpl {
    private static final String BAD = "Выходим";

//    public static void outputLog() {
//        Iterator<History> iterator = History.log.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//    }

    public static void output(double result) {
        System.out.println(result);
    }
    public static void outputBad() {
        System.out.println(BAD);
    }
}

package by.tms.test.util;

import by.tms.test.entity.History;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReaderImpl implements MyReader {


    @Override
    public String input() {
        Scanner sc = new Scanner (System.in);
        String value = sc.next();
        History.add(value);
        return value;
    }

    @Override
    public String inputOp() {
        Scanner sc = new Scanner (System.in);
        String value = sc.next();
        History.add(value);
        if(Validator.validOp(value))return value;
        WriterImpl.outputBad();
        return "e";
    }

    @Override
    public double inputNum() throws InputMismatchException {
        double value = 0;
        Scanner sc = new Scanner(System.in);
        value = sc.nextDouble();
        History.add(String.valueOf(value));
        return value;
    }
}

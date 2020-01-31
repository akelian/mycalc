package by.tms.test.action;

import by.tms.test.service.Auth;
import by.tms.test.service.Reg;
import by.tms.test.util.WriterImpl;

import java.util.Scanner;

public class ConsoleAppImpl {

    public static void launch() {
//        MyReader reader = new ReaderImpl();
        System.out.println("1 for auth, 2 for reg, 3 for exit");
        boolean check = true;

        while(check){
            Scanner scanner = new Scanner(System.in);
            String choose = scanner.nextLine();
            switch (choose/*(int) reader.inputNum()*/){
                case "1":
                    Auth.auth();
                    break;
                case "2":
                    Reg.newUser();
                    break;
                case "3":
                    WriterImpl.outputBad();
                    check = false;
                    break;
            }
            scanner.close();
        }
//        do {
//            String кастыль = reader.inputOp();
//            if (Objects.equals(кастыль, "e"))break;
//            Calc calculator = new CalcImpl(кастыль, reader.inputNum(), reader.inputNum());
//            WriterImpl.output(calculator.calc());
//        } while (true);
//        History.showLogs();
    }
}

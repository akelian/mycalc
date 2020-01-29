package by.tms.test.action;

import by.tms.test.util.MyReader;
import by.tms.test.util.ReaderImpl;
import by.tms.test.util.WriterImpl;

public class ConsoleAppImpl {

    public static void launch() {
        MyReader reader = new ReaderImpl();
        System.out.println("1 for auth, 2 for reg, 3 for exit");
        boolean check = true;
        while(check){
            switch ((int) reader.inputNum()){
                case 1:
                    System.out.println("will be soon");
                    break;
                case 2:

                    break;
                case 3:
                    WriterImpl.outputBad();
                    check = false;
                    break;
            }
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

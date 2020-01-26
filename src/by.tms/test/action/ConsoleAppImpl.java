package by.tms.test.action;

import by.tms.test.util.MyReader;
import by.tms.test.util.ReaderImpl;

public class ConsoleAppImpl {

    public static void launch() {
        MyReader reader = new ReaderImpl();
        System.out.println("1 for auth, 2 for reg");
        while(true){
            switch ((int) reader.inputNum()){
                case 1:
                    System.out.println("will be soon");
                    break;
                case 2:

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

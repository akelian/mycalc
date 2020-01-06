package by.tms.test.action;

import by.tms.test.entity.Calc;
import by.tms.test.entity.CalcImpl;
import by.tms.test.entity.History;
import by.tms.test.util.ReaderImpl;
import by.tms.test.util.WriterImpl;
import by.tms.test.util.MyReader;

import java.util.Objects;

public class ConsoleAppImpl {

    public static void launch() {
        MyReader reader = new ReaderImpl();
        do {
            String кастыль = reader.inputOp();
            if (Objects.equals(кастыль, "e"))break;
            Calc calculator = new CalcImpl(кастыль, reader.inputNum(), reader.inputNum());
            WriterImpl.output(calculator.calc());
        } while (true);
        History.showLogs();
    }
}

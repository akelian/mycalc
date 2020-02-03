package by.tms.test.action;

import by.tms.test.entity.Calc;
import by.tms.test.entity.CalcImpl;
import by.tms.test.entity.History;
import by.tms.test.service.Auth;
import by.tms.test.service.Reg;
import by.tms.test.util.MyReader;
import by.tms.test.util.ReaderImpl;
import by.tms.test.util.WriterImpl;

public class ConsoleAppImpl {
    MyReader reader = new ReaderImpl();
    public void launch() {
        boolean check = true;
        while(check){
            System.out.println("1 for auth, 2 for reg, 3 for exit, 4 to show log");
            switch (reader.input()){
                case "1":
                    Auth.auth();
                    continue;
                case "2":
                    Reg.newUser();
                    continue;
                case "3":
                    WriterImpl.outputBad();
                    check = false;
                    break;
                case "4":
                    History.showLogs();
                    break;
            }
        }
    }

    public void summoningDaCalc(){
        System.out.println("Input operator, then two values");
        Calc calculator = new CalcImpl(reader.inputOp(), reader.inputNum(),
                reader.inputNum());
        WriterImpl.output(calculator.calc());
    }
}

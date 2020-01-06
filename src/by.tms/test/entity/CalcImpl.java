package by.tms.test.entity;

public class CalcImpl implements Calc {

    private static String op;
    private static double n1;
    private static double n2;

    public CalcImpl(String op, double n1, double n2) {
        CalcImpl.op = op;
        CalcImpl.n1 = n1;
        CalcImpl.n2 = n2;
    }

    @Override
    public double calc() {
            switch (op){
                case "+": return sum(n1, n2);
                case "-": return sub(n1, n2);
                case "/": return div((int)n1, (int)n2);
                case "*": return mult(n1, n2);
                default: return 0.0;
            }

    }

    private static double sum(double n1, double n2){
        return n1 + n2;
    }
    private static double sub(double n1, double n2){
        return n1 - n2;
    }
    private static double div(double n1, double n2){
        return n1 / n2;
    }
    private static int div(int  n1, int n2){
        return n1 / n2;
    }
    private static double mult(double n1, double n2){
        return n1 * n2;
    }
}

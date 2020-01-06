package by.tms.test.util;

public final class Validator {
    private static final String MINUS = "-";
    private static final String PLUS = "+";
    private static final String DIVIDE = "*";
    private static final String MULTIPLE = "/";

    private Validator() {
    }

    public static boolean validOp(String op){
        if(op.length() == 1){
            return op.equals(MINUS) || op.equals(PLUS)
                    || op.equals(DIVIDE) || op.equals(MULTIPLE);
        } return false;
    }

    public static boolean validNum(double n){
        return n != 0;
    }
}

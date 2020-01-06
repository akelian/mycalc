package by.tms.old;

import java.util.Scanner;

public class Objects {
//    void abc (String s){
//        switch (s){
//            case "Hello":
//                System.out.println("1");
//                break;
//            case "bye":
//                System.out.println("2");
//                break;
//            default:
//                System.out.println("default");
//        }
//    }

//    void conc (String s){
//        StringBuilder newStr = new StringBuilder(s);
//
//        for (int i = s.length()-1; i > 0; i--) {
//           newStr.append(s.charAt(i));
//        }
//
//        System.out.println(newStr.toString());
//    }

//    void ident (String s) {
//        switch (s){
//
//        }
//    }

//    boolean isPal(String s){
//        if (rev(s)) return true;
//    }

    void rev (String s) {
        char[] oldArr = s.toCharArray();
        char[] newArr = new char[s.length()];

        for (int i = oldArr.length-1, ii = 0; i >= 0; i--, ii++) {
            newArr[ii] = oldArr[i];
        }
        String ss = String.valueOf(newArr);
        System.out.println("Проверка " + ss + " на равенство выдала: " + s.equals(ss));
    }

    public static void main(String[] args) {
        Objects ob = new Objects();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        ob.rev(s);

//        System.out.println();
    }
}

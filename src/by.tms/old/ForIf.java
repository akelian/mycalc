package by.tms.old;

public class ForIf {

//    void equal(int a, int b){
//        if (a == b){
//            System.out.println(a + " == " + b);
//        } else if(a > b){
//            System.out.println(a + " > " + b);
//        } else {
//            System.out.println(a + " < " + b);
//        }
//    }

    void fora(){
        int i = 0;
//        for (i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//        System.out.println(i);
//        while (i<10){
//            System.out.println(i);
//            i++;
//        }
//        do {
//            System.out.println(i);
//            i++;
//        } while (i < 10);
    }
    public void stop(){
        System.out.println("stop");
    }

    void getValues (int[] a) {
        int min = a[0], max = a[0];
        for (int value : a) {
            if (max < value) {
                max = value;
            }
            if (min > value) {
                min = value;
            }
        }
        System.out.println("min value is " + min + " max value is " + max);
    }
    void sort (int[] a){
        int[] newArr = new int[a.length];
        int min = a[0];
        for (int i: a) {
            if(min <= i){
                for (int j = 0; j < newArr.length; j++) {
                    newArr[j+1] = i;
                }
            }
        }
        for (int v: newArr) {
            System.out.println(v);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{2, 1, 73, -44, 108};
        ForIf forIf = new ForIf();
        forIf.sort(a);


//        System.out.println(Arrays.toString(a));
//        System.out.println(a[6]);

    }
}

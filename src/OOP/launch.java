package OOP;

public class launch {
    public static void main(String[] args) {
        Auto au = new Auto(15, 10,"myCar", 4, "BMW");
        au.start();
        au.getInfo();
    }
}

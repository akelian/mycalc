package OOP;

public class Auto extends Ground implements Ride{
    private String brand;

    public Auto(int speed, int weight, String name, int wheelNum, String brand) {
        super(speed, weight, name, wheelNum);
        this.brand = brand;
    }

    @Override
    protected void getInfo() {
        super.getInfo();
    }

    @Override
    public void start() {
        System.out.println(brand +" starting move");

    }
}

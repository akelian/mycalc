package OOP;

public class Bicycle extends Ground implements Ride {
    public Bicycle(int speed, int weight, String name, int wheelNum) {
        super(speed, weight, name, wheelNum);
    }

    @Override
    public void start() {

    }
}

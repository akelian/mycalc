package OOP;

public class Bus extends Ground implements Ride {


    public Bus(int speed, int weight, String name, int wheelNum) {
        super(speed, weight, name, wheelNum);
    }

    @Override
    public void start() {

    }
}

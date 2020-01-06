package OOP;

public abstract class Ground extends Transport{
    private int wheelNum;

    public Ground(int speed, int weight, String name, int wheelNum) {
        super(speed, weight, name);
        this.wheelNum = wheelNum;
    }

}

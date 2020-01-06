package OOP;

public abstract class Transport {
    private int speed;
    private int weight;
    private String name;

    public Transport(int speed, int weight, String name) {
        this.speed = speed;
        this.weight = weight;
        this.name = name;
    }

    protected void getInfo (){
//        this.name = name;
//        this.speed = speed;
//        this.weight = weight;
        System.out.println(name + " has " + weight + " kg, move with " + speed + " km/h");
    }
}

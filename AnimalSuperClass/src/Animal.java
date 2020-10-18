public class Animal {
    private String name;
    private int stomachs;
    private int speed;
    private double weight;

    public Animal(String name, int stomachs, int speed, double weight) {
        this.name = name;
        this.stomachs = stomachs;
        this.speed = speed;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Animal eat() has been called");
    }

    public void move(int speed){
        System.out.println("Animal move() has been called");
        System.out.println("Animal moving at " + speed + " miles per hour");
    }

    public String getName() {
        return name;
    }

    public int getStomachs() {
        return stomachs;
    }

    public int getSpeed() {
        return speed;
    }

    public double getWeight() {
        return weight;
    }


}

public class Dog extends Animal {
    private int legs;
    private String fur;

    public Dog(String name, int speed, double weight, int legs, String fur) {
        super(name, 1, speed, weight);
        this.legs = legs;
        this.fur = fur;
    }

    public void chew(){
        System.out.println("Dog chew() has been called");
    }

    @Override // Basically means we can create our own methods with THE SAME NAME as methods in our super class
    public void eat() {
        System.out.println("Dog eat() has been called");
        chew();
        super.eat(); // This is optional now, don't HAVE to call it
    }

    public void walk(){
        System.out.println("Dog walk() called");
        super.move(5);
    }

    public void moveLegs(){
        System.out.println("Dog moveLegs() called");
    }

    public int getLegs() {
        return legs;
    }

    public String getFur() {
        return fur;
    }
}

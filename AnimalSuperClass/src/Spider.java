public class Spider extends Animal {
    private int eyes;
    private int webs;
    private int legs;

    public Spider(String name, int stomachs, int speed, double weight, int eyes, int webs, int legs) {
        super(name, 1, speed, weight);
        this.eyes = eyes;
        this.webs = webs;
        this.legs = legs;
    }

    public void makeWeb() {
        System.out.println("Spider makeWeb() called");
        super.move(3);
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getWebs() {
        return webs;
    }

    public void setWebs(int webs) {
        this.webs = webs;
    }

    public void setLegs(){
        this.legs = legs;
    }

    public int getLegs(){
        return legs;
    }
}

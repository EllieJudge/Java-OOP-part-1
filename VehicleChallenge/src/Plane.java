public class Plane extends Vehicle {
    private int wings;
    private boolean canFly;
    private int currentGear;

    public Plane() {
        super("Plane", "massive");
        this.wings = 2;
        this.canFly = true;
        this.currentGear = 1;
    }

    public int getWings() {
        return wings;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Plane.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            super.stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if (newVelocity >= 10 && newVelocity <= 20) {
            changeGear(2);
        } else if (newVelocity >= 20 && newVelocity <= 30) {
            changeGear(3);
        } else if (newVelocity >= 30 && newVelocity <= 40) {
            changeGear(4);
        } else {
            changeGear(5);
        }

        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }

    }

    public void changeVelocity(int speed, int direction){
        System.out.println("Plane.changeVelocity(): Velocity " + speed + " direction " + direction);
        super.move(speed, direction);
    }

    public void takeOff() {
        move(20, 0);
        steer(0);
        accelerate(20);


        changeVelocity(100, 0);

        if(getCurrentVelocity() >= 100) {
            steer(45);
            moveWings(45);
        }
    }

    public void moveWings(int degrees) {
        System.out.println("Plane.moveWings(): moved wings to " + degrees);
    }

    // take off
        // move(accelerate)
        // steer()
        // if speed > 100
            // steer(up)
            // moveWings 50 degrees(up)

    // land
        //  move(decelerate)
        // if speed < 100
            // steer(down)
            // moveWings 50 degrees(down)
    // stop();


    public void land(){
        move(getCurrentVelocity() - 10, 0);
        steer(-10);
        accelerate(-20);


        changeVelocity(-50, -50);

        if(getCurrentVelocity() <= 100) {
            steer(-45);
            moveWings(-45);
            stop();
        }
        else if(getCurrentVelocity() == 50) {
            stop();
        }
    }

}

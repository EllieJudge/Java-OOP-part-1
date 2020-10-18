public class Main {
    public static void main (String[]args){

        Car porsche = new Car(); // new Car() <== initialization
        Car holden = new Car();
        Car fiesta = new Car();
        Car volvo = new Car();


        porsche.setModel("Porsche");
        porsche.setDoors(4);
        System.out.println(porsche.getDoors());
        System.out.println("Car model is: " + porsche.getModel());


        holden.setModel("Holden");
        holden.setDoors(2);
        System.out.println("Car model is: " + holden.getModel() + " number of doors = " + holden.getDoors());

        fiesta.setModel("Ford Fiesta, baby!");
        fiesta.setDoors(3);
        System.out.println("Ellie's car was a "
                            + fiesta.getModel()
                            + " as car not cool enough. It had "
                            + fiesta.getDoors()
                            + " doors because one of them fell off.");
    }
}


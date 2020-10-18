public class Main {
    public static void main(String[]args){
        Animal animal = new Animal("Generic animal", 1, 10, 40);

        Dog cockapoo = new Dog("Cockapoo", 100, 40, 4, "curly and soft");


        Spider tarantula = new Spider("Tarantula", 1, 3, 4, 8, 10, 8);

//        System.out.println(animal.getName());
//        System.out.println(cockapoo.getName());

        // Inheritance
        // Getting eat() from animal class
//        cockapoo.eat();

//        cockapoo.walk();
        System.out.println( cockapoo.getLegs());



        tarantula.makeWeb();

    }
}

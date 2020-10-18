public class Main {
    public static void main(String[]args){
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName = " + person.getFullName());
        System.out.println("Teen = " + person.isTeen());

        person.setFirstName("John");
        person.setLastName("Smith");
        person.setAge(-5);
        System.out.println("Age is " + person.getAge());
        person.isTeen();
        System.out.println("fullName = " + person.getFullName());
        System.out.println("Teen = " + person.isTeen());
    }
}

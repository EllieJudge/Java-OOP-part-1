public class Main {
    public static void main(String[]args){

       VipCustomer person1 = new VipCustomer();

       VipCustomer person2 = new VipCustomer("Ellie", 50 );

       VipCustomer person3 = new VipCustomer("Bob", 70, "bobemail.com");

        System.out.println(person1.getName());
        System.out.println(person2.getName());
        System.out.println(person3.getName());
        System.out.println(person3.getEmail());



    }
}


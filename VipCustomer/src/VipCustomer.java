public class VipCustomer {
    private String name;
    private int creditLimit;
    private String email;

    public VipCustomer(){
      this("Default name", 100, "default email");
        System.out.println("Empty constructor called");
    }

    public VipCustomer(String name, int creditLimit){
        this(name, creditLimit, "email@email.com");
        System.out.println("Two parameter constructor called");
    }

    public VipCustomer(String name, int creditLimit, String email) {
        // Only constructor that saves fields (others just call this constructor)
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("Three parameter constructor called");
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}

public class BankAccount {
    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // CONSTRUCTORS

    public BankAccount() {
       // Can create more than one constructor
        // Which means if an empty constructor is called you can create default values
        // This constructor CALLS other constructor and passes in the default values
        // This has to be first line of code in this case:
        this(354, 0.0, "Default name", "Default email", "Default phone number");
        System.out.println("Empty constructor called");
    }

    public BankAccount(long accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(989, 0.0, customerName, email, phoneNumber);
    }

    // SETTERS
    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public long getAccountNumber(){
        return this.accountNumber;
    }

    // GETTERS
    public double getBalance(){
        System.out.println("Your balance is: £");
        return this.balance;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    // METHODS
    public void depositMoney(double money) {
        System.out.println("Your desposit amount is: £" + money);
        System.out.println("Your new balance is: £" + (this.balance += money));
    }

    public double withDrawMoney(double amount) {
        if(this.balance > amount){
            System.out.println("Your new balance is: £" + (this.balance -= amount));
            System.out.println("Here is your money: £" + amount);
            return amount;
        }
        else {
            System.out.println("Only " + balance + " available. Withdrawal not processed.");
            return -1;
        }
    }


}


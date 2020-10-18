public class ForLoops {
    public static void main(String[]args){
        for(int i = 2; i < 9; i++){
            System.out.println(calculateInterest(1000, i));
        }
    }
    public static double calculateInterest(int amount, double interestRate){
        return (amount * (interestRate/100));
    }
}

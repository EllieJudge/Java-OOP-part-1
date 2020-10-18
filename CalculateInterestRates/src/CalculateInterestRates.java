public class CalculateInterestRates {
    public static void main(String[]args) {
//        for(int i = 2; i < 9; i++) {
//            System.out.println("The interest rate for 10,000 at " + i + "% = " + String.format("%.2f",CalculateInterest(10000.0, i)));
//        }

//        for(int i = 8; i > 1; i--) {
//            System.out.println("The interest rate for 10,000 at " + i + "% = " + String.format("%.2f",CalculateInterest(10000.0, i)));
//        }

    int count = 0;

        for(int i = 10; i < 50; i++) {
            if(count == 3) {
                System.out.println("Exiting for loop.");
                break;
                }
            if (isPrime(i)) {
                System.out.println(i + " is a Prime number!");
                count++;
            }

        }

    }

//    public static double CalculateInterest(double amount, double interestRate) {
//        return (amount * (interestRate/100));
//    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

}

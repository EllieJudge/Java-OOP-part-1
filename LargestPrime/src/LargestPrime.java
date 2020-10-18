public class LargestPrime {
    public static void main (String [] args) {
        System.out.println(getLargestPrime(217)); // 7
    }
    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        } else {
            for (int i = number-1; i > 1; i--) {
                if (number % i == 0) {
                    number = i;
                }
            }
            return number;
        }
    }
}

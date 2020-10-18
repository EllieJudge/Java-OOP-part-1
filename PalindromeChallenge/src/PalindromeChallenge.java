public class PalindromeChallenge {
    public static void main(String[]args){
        System.out.println(isPalindrome(-22));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int numberToFiddle = number;
        while(numberToFiddle != 0) {
            int lastDigit = numberToFiddle % 10;
            reverse = (reverse * 10) + lastDigit;
            numberToFiddle /= 10;
        }
        return reverse == number;
    }


}
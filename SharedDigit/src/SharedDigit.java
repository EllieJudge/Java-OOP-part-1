public class SharedDigit {
    public static void main(String[]args){
        System.out.println(hasSharedDigit(10, 12));
    }
    public static boolean hasSharedDigit(int a, int b){
        if(a < 10 || b < 10 || a > 99 || b > 99){
            return false;
        }

        int firstDigitA = a % 10;
        int firstDigitB = b % 10;

        int lastDigitA = a / 10;
        int lastDigitB = b / 10;

        if (firstDigitA == firstDigitB || firstDigitA == lastDigitB || lastDigitA == firstDigitB || lastDigitA == lastDigitB) {
            return true;
        }
        else {
            return false;
        }
    }
}



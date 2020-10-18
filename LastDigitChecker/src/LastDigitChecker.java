public class LastDigitChecker {
    public static void main (String[]arg){
        System.out.println(hasSameLastDigit(19, 10, 10));
    }
    public static boolean isValid(int number) {
        if(number < 10 || number > 1000) {
            return false;
        }
        return true;
    }
    public static boolean hasSameLastDigit(int a, int b, int c){
        if(isValid(a) && isValid(b) && isValid(c)){
            // if two numbers end in same digit return true;

            int lastDigitA = a % 10;
            int lastDigitB = b % 10;
            int lastDigitC = c % 10;

            if(lastDigitA == lastDigitB || lastDigitA == lastDigitC || lastDigitB == lastDigitC){
                return true;
            }
            else return false;
        }
        else return false;
        }



}


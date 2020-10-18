public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175)); //true
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176)); //false
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));//true
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123)); //false

    }
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        if(firstNumber < 0 && secondNumber < 0) {
            return Math.round(firstNumber / 1000) == Math.round(secondNumber / 1000);
        }
        return Math.floor(firstNumber * 1000) == Math.floor(secondNumber * 1000);
    }
}

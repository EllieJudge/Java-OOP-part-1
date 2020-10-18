public class TeenNumberChecker {
    public static void main(String[]args){
        System.out.println(hasTeen(13, 14, 15)); //true
        System.out.println(hasTeen(10, 14, 15)); //true
        System.out.println(hasTeen(100, 14, 155)); //true
        System.out.println(hasTeen(100, 104, 5)); //false
    }

    public static boolean isTeen(int num){
        return num >= 13 && num <= 19;
    }

    public static boolean hasTeen(int firstNum, int secondNum, int thirdNum) {
        return isTeen(firstNum) || isTeen(secondNum) || isTeen(thirdNum);
    }
}



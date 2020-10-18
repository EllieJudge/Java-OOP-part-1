public class SumOdd {
    public static void main(String[]args){
//        System.out.println(sumOdd(1, 100));
//        System.out.println(sumOdd(-1, 100));
//        System.out.println(sumOdd(100, 100));
//        System.out.println(sumOdd(13, 13));
//        System.out.println(sumOdd(100, -100));
//        System.out.println(sumOdd(100, 1000));
//        2500
//        -1
//        0
//        13
//        -1
//        247500

//        System.out.println(isEven(2)); //true

        int number = 4;
        int finishNumber = 20;
        int countEven = 0;

        while(number <= finishNumber){
            number++;
            if(!isEven((number))){
                continue;
            }
            System.out.println("It's even! " + number);
            countEven++;
            if(countEven >= 5){
                break;
            }
        }
    }

    public static boolean isOdd(int number) {
        if(number < 0) {
            return false;
        }
        else if (number % 2 != 0){
            return true;
        }
        else return false;
    }

    public static int sumOdd(int start, int end) {
        if(start <= 0 || end <= 0 || end < start) {
            return -1;
        }
        else {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        }
    }

    public static boolean isEven(int num){
        if(num % 2 == 0) {
            return true;
        }
        return false;
    }
}

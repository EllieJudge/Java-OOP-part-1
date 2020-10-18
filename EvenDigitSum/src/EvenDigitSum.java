public class EvenDigitSum {
    public static void main(String[]args){
        System.out.println(EvenDigitSum(252));
        System.out.println(EvenDigitSum(123456789));
        System.out.println(EvenDigitSum(-22));
        System.out.println(EvenDigitSum(6));
        System.out.println(EvenDigitSum(7));
    }
    public static int EvenDigitSum(int number) {
        if(number < 0){
            return -1;
        }
        else if (number < 9 && number % 2 == 0){
           return number += number;
        }

        int sum = 0;

        int lastDigit = number % 10;
        if(lastDigit % 2 == 0){
            sum += lastDigit;
        }


        int firstDigit = number;
        while(number >= 10) {
            firstDigit /= 10;

            int endDigit = firstDigit % 10;
            if(endDigit % 2 == 0) {
                sum += endDigit;
            }
            number /= 10;
        }
        return sum;
    }
}


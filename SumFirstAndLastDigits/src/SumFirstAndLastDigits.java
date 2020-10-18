public class SumFirstAndLastDigits {
    public static void main(String[]args) {
        System.out.println(sumFirstAndLastDigit(103));
        System.out.println(sumFirstAndLastDigit(3));
        System.out.println(sumFirstAndLastDigit(10));
        System.out.println(sumFirstAndLastDigit(5));
    }
    public static int sumFirstAndLastDigit(int number){

        if (number <0){
            return -1;
        }
        else if(number <= 9){
            return number += number; // changed this from number += number
        }
        int num = number;
        int lastdigit = num % 10; // finds the remainder of it divided by 10
        System.out.println("last dig " + lastdigit);
        int firstdigit = num; // 103

        while (firstdigit >= 10){
            System.out.println("first dig " + firstdigit);
            firstdigit = firstdigit / 10; // how many 10's are in it
        }
        System.out.println("firist digit after loop " + firstdigit);
        return lastdigit + firstdigit;

    }
}

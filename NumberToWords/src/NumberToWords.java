public class NumberToWords {
    public static void main (String[]args){
        numberToWords(100);
        numberToWords(401);
//        numberToWords(9901);
//        numberToWords(31);

//        System.out.println(getDigitCount(10)); // 3
//        System.out.println(getDigitCount(123)); // 3
//        System.out.println(getDigitCount(-12)); // -1
//        System.out.println(getDigitCount(5200)); // 4


//        System.out.println(reverse(100));
    }

    public static void numberToWords(int number){
        if(number < 0) {
            System.out.println("Invalid Value");
        }
        else if(number == 0) {
            System.out.println("Zero");
        }


        int numLength =  getDigitCount(number);
        int reverseNumLength = getDigitCount(reverse(number));
        int reversedNumber = reverse(number);

        String stringNumber = "";

        while(reversedNumber > 0) {
            int lastDigit = reversedNumber % 10;

            switch(lastDigit) {
                case 0:
                    stringNumber += "Zero ";
                    break;
                case 1:
                    stringNumber += "One ";
                    break;
                case 2:
                    stringNumber += "Two ";
                    break;
                case 3:
                    stringNumber += "Three ";
                    break;
                case 4:
                    stringNumber += "Four ";
                    break;
                case 5:
                    stringNumber += "Five ";
                    break;
                case 6:
                    stringNumber += "Six ";
                    break;
                case 7:
                    stringNumber += "Seven ";
                    break;
                case 8:
                    stringNumber += "Eight ";
                    break;
                case 9:
                    stringNumber += "Nine ";
                    break;
            }
            reversedNumber = reversedNumber / 10;
        }

        // calculate difference in length between reverseNumber and getDigitCount

        String missingZeros = "";

        for(int i = 0; i < numLength - reverseNumLength; i++){
            missingZeros += "Zero ";
        }
        System.out.println(stringNumber + missingZeros );
    }


    public static int reverse(int number) {
        int reverse = 0;

        if (number > 0) {
            while (number > 0) {
                int firstRightDigit = number % 10;
                reverse *= 10;
                reverse += firstRightDigit;
                number /= 10;
            }
            return reverse;

        } else if (number < 0) {
            while (number < 0) {
                int firstRightDigit = number % 10;
                reverse *= 10;
                reverse += firstRightDigit;
                number /= 10;
            }
            return reverse;

        } else {
            return 0;
        }
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        else if(number==0){
            return 1;
        }else{
            int count = 0;

            while(number>0){
                int digit = number%10;
                count++;
                number/=10;
            }
            return count;
        }
    }
}

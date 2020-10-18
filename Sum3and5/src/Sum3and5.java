public class Sum3and5 {
    public static void main(String[]args){
        System.out.println();

        int sum = 0;
        int count = 0;

        for(int i = 1; i <= 1000; i++){
            if(i % 3 == 0 && i % 5 == 0) {
                sum += i;
                count++;
                System.out.println(i + " is divisble by 3 and 5");
                if(count == 5){
                    System.out.println("Exiting because 5 numbers found, sum = " + sum);
                    break;
                }
            }
        }
    }

}



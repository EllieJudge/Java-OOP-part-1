public class SumDigits {
    public static void main(String[] args) {
        System.out.println(SumDigits(125));
        System.out.println(SumDigits(1250));
        System.out.println(SumDigits(12));
        System.out.println(SumDigits(12345));
    }

    public static int SumDigits(int num){
        if(num >= 10){
                int count = 0;
                do {
                    int end = num % 10; // 5
                    count += end;
                    num = num / 10;
                    continue;
                } while(num > 0);
                    return count;
            }
        return -1;
    }
}

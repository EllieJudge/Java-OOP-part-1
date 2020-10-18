import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[]args){
        int sum = 0;
        int counter = 1;
        Scanner scanner = new Scanner(System.in);

        while(counter < 11){
            System.out.println("Enter number #" + counter + ":");
            Boolean isAnInt = scanner.hasNextInt();
            if(isAnInt) {
                int number = scanner.nextInt();
                sum += number;
            } else {
                System.out.println("Invalid number.");
                counter -= 1;
                scanner.nextLine();
            }
            counter++;
        }
        System.out.println("Total = " + sum);
        scanner.close();
    }
}

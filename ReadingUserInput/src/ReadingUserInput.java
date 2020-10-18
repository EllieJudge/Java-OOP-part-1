import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your year of birth: ");

        Boolean hasNextInt = scanner.hasNextInt(); // Checks next entry is an integer

        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line character (enter key)
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2020 - yearOfBirth;

            if(age > 0 && age < 120){
                System.out.println("Your name is: " + name + ", and your age is " + age);
            }
            else {
                System.out.println("Invalid year of birth.");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }
        scanner.close();
    }
}


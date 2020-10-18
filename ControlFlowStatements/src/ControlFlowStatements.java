public class ControlFlowStatements {
    public static void main (String[]args){
        SwitchStatement('A');
        WhatDayIsIt(-1);
        WhatDayIsIt(0);
        WhatDayIsIt(1);
        WhatDayIsIt(2);
        WhatDayIsIt(3);
        WhatDayIsIt(7);


    }
    public static void SwitchStatement(char letter){
//        char letter = 'A';
        switch (letter) {
            case 'A':
                System.out.println("It's an A!");
                break;
            case 'B':
                System.out.println("It's a B!");
                break;
            case 'C':
                System.out.println("It's a C");
                break;
            case 'D': case 'E': case 'F': case 'G':
                System.out.println("It's a " + letter);
                break;
            default:
                System.out.println("Wasn't the right letter I guess?");
        }
    }
    public static void WhatDayIsIt(int number){
        switch(number){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4: case 5: case 6:
                System.out.println("Basically the weekend");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
    public static void printNumberInWord(int number){
        switch(number){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Other");
        }
    }
}

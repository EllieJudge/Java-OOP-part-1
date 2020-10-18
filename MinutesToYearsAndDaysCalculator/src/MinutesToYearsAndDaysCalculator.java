public class MinutesToYearsAndDaysCalculator {
    public static void main (String[]args){
        printYearsAndDays(525600); //1 y 0 d
        printYearsAndDays(1051200); //2 y 0 d
        printYearsAndDays(561600); // 1 y 25 d
        printYearsAndDays(1440); // 0 y 1 d
        printYearsAndDays(0); // 0 y 0 d
        printYearsAndDays(5);
        printYearsAndDays(-525600); // invalid value
    }


    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }
        else {
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            long daysRemaining = days % 365;
            System.out.println(minutes + " min = "
                    + Math.toIntExact(years)
                    + " y and " + Math.toIntExact(daysRemaining) + " d");
        }
    }
}

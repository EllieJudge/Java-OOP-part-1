public class SpeedConverter {

    public static void main(String[] args) {
        System.out.println("Hello Wfsaasorld!");
                printConversion(1.5);
                //→ should print the following text (into the console - System.out): 1.5 km/h = 1 mi/h
                printConversion(10.5);
                // → should print the following text (into the console - System.out): 10.25 km/h = 6 mi/h
                printConversion(-5.6);
                //→ should print the following text (into the console - System.out): Invalid Value
                printConversion(25.42);
                //→ should print the following text (into the console - System.out): 25.42 km/h = 16 mi/h
                printConversion(75.114);
                //→ should print the following text (into the console - System.out): 75.114 km/h = 47 mi/h
        printConversion(95.75);
        //→ should print the following text (into the console - System.out): 95.75 km/h = 59 mi/h
    }

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour +" "+
                    "km/h = " + milesPerHour +" "+
                    "mi/h");
        }
    }
}

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }
    public static void printConversion(double kilometersPerHour){
        System.out.println(toMilesPerHour(1.5));
    }
}

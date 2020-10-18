public class SecondsAndMinutes {

    public static void main (String[]args){
        System.out.println(getDuration(65, 45));
    }

    public static String getDuration (int minutes, int seconds){
        if(!(minutes >= 0) || !(seconds >=0 && seconds <= 59)){
            return "Invalid value";
        }
        int hours = 0;
        int remainingMinutes = 0;

        if(minutes % 60 == 0) {
            hours = minutes / 60;
        }
        else if (!(minutes % 60 == 0)) {
            remainingMinutes = minutes % 60;
            hours = minutes / 60;
        }
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

    public static String getDuration (int seconds) {
        if(!(seconds >= 0)) {
            return "Invalid Value";
        }
        int minutes = 0;
        int remainingSeconds = 0;

        if(seconds % 60 == 0) {
            minutes = seconds / 60;
        }
        else if (!(seconds % 60 == 0)) {
            remainingSeconds = seconds % 60;
            minutes = seconds / 60;
        }

        return getDuration(minutes, remainingSeconds);
    }

}


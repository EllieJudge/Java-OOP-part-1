public class Main {



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
//        public static void main(String[] args) {
//            int playerPosition = calculateHighScorePosition(1500);
//            displayHighScorePosition("Tim", playerPosition);
//
//            playerPosition = calculateHighScorePosition(900);
//            displayHighScorePosition("Ellie", playerPosition);
//
//            playerPosition = calculateHighScorePosition(400);
//            displayHighScorePosition("James", playerPosition);
//
//            playerPosition = calculateHighScorePosition(100);
//            displayHighScorePosition("Alex", playerPosition);
//
//        }
//
//            public static void displayHighScorePosition (String name,int position){
//                System.out.println(name + " managed to get into position " + position + "!");
//            }
//
//            public static int calculateHighScorePosition ( int score){
//                if (score >= 1000) {
//                    return 1;
//                } else if (score >= 500) {
//                    return 2;
//                } else if (score >= 100) {
//                    return 3;
//                } else {
//                    return 4;
//                }
//            }






public class FlourPackProblem {
    public static void main (String[]args){
//        System.out.println(canPack(1, 0, 4)); // false
//        System.out.println(canPack(1, 0, 5)); // true);
        System.out.println( canPack(0, 5, 4)); // true);
//
//        System.out.println(canPack(0, 5, 4)); // true);
//        System.out.println(canPack(2, 2, 11)); ; // false
//        System.out.println(canPack(-3, 2, 12));// false (no negatives)
//        System.out.println(canPack(2,1,5)); //true
    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if(bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int bigBags = bigCount * 5; // 0
        int smallBags = smallCount; // 5

        if (bigBags + smallBags < goal) {
            System.out.println("here");
            return false;
        }

        //if fits exactly
        if (bigBags + smallBags == goal) {
            System.out.println("here same as goal");
            return true;
        }

        // if it's over the goal
        // if goal divided by total

        // canPack (2, 1, 5)
        // total = bigBags + smallBags (11)
        // (11)total / goal == 1
        // 1 == smallBags

        // always checking bigCount fits into goal

        if(bigBags + smallBags > goal) {
//            System.out.println("hereee");
//            int total = bigBags + smallBags; // 5
//
//            System.out.println("Total: " + total);
//            int remainder = total / goal; // 1
//
//            System.out.println("remainder " + remainder);
//            return remainder == smallBags;
            System.out.println(goal / bigCount != 0);
            return true;
        }

        else return true;
    }
}

public class PlayingCat {
    public static boolean isCatPlaying (boolean summer, int temperature){
        if((!summer) && temperature >= 25 && temperature <= 35){
            return true;
        }
        else if(summer && temperature >= 25 && temperature <= 45){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        isCatPlaying(true, 10); //false
        isCatPlaying(false, 36); //false
        isCatPlaying(false,35); //true
    }
}

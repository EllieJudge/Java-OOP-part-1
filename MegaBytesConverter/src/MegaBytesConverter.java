public class MegaBytesConverter {

    public static void main (String[]args){
        printMegaBytesAndKiloBytes(5000);
    }


    public static void printMegaBytesAndKiloBytes (int kiloBytes){
        int howManyMegasInKilo = (kiloBytes / 1024); 
        int remainder = kiloBytes % 1024;

        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.printf("%d KB = %d MB and %d KB%n", kiloBytes, howManyMegasInKilo, remainder);
        }
    }
}

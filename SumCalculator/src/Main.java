public class Main {
    public static void main(String[]args){
        SimpleCalculator calculation = new SimpleCalculator();

        calculation.setFirstNumber(22.0);
        calculation.setSecondNumber(22.0);

        System.out.println(calculation.getFirstNumber());
        System.out.println(calculation.getSecondNumber());


        System.out.println(calculation.getAdditionResult());
    }
}

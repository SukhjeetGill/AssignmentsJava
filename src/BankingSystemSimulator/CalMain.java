package BankingSystemSimulator;

public class CalMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(5.0, 2.0);
        System.out.println("Addition: " + calculator.add());
        System.out.println("Subtraction: " + calculator.subtract());
        System.out.println("Multiplication: " + calculator.multiply());

        try {
            System.out.println("Division: " + calculator.divide());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}

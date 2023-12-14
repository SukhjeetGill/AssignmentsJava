import java.util.Scanner;
public class Calculator {
    public static int sum(int x, int y) {
        int sum = x + y;
        return sum;
    }public static int subtract(int x, int y) {
        int subtract = x - y;
        return subtract;
    }public static int multiply(int x, int y) {
        int multiply = x * y;
        return multiply;
    }public static double divide(int x, int y) {
        double divide = x / y;
        return divide;
    }public static double modulus(int x, int y) {
        double mod = x % y;
        return mod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Welcome to my calculator");
        System.out.println("1. Press 1 for addition");
        System.out.println("1. Press 2 for subtraction");
        System.out.println("1. Press 3 for multiplication");
        System.out.println("1. Press 4 for division");
        System.out.println("1. Press 5 for modulus");
        System.out.println("Enter your choice:");
        int ch = sc.nextInt();
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        switch (ch) {
            case 1:
                int sum = sum(num1, num2);
                System.out.println("The sum is: " + sum);
                break;
            case 2:
                int subtracts = subtract(num1, num2);
                System.out.println("The substraction is: " + subtracts);
                break;
            case 3:
                int multiply = multiply(num1, num2);
                System.out.println("The multiplication is: " + multiply);
                break;
            case 4:
                double modulus = modulus(num1, num2);
                System.out.println("The modulus is: " + modulus);
                break;
            case 5:
                double divide = divide(num1, num2);
                System.out.println("The division is: " + divide);
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}


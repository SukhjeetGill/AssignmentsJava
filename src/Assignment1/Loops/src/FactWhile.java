import java.util.Scanner;
public class FactWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.println("Enter the number to find the factorial: ");
        int a = sc.nextInt();
        while (a > 0) {
            fact = fact * a;
            a--;
        }
        System.out.println("Factorial is: "+  fact);
    }
}

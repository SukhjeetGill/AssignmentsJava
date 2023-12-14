import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ( a > b && a > c ){
            System.out.println("First number is greatest: " + a);
        }
        else if ( b > c ){
            System.out.println("Second number is greatest: " + b);
        }
        else {
            System.out.println("Third number is greatest: " + c);
        }
    }
}

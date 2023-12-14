import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=0;
        int y=1;
        int sum=0;
        System.out.println("Enter the nth value: ");
        int n = sc.nextInt();
        System.out.print(x + " " + y+ " ");
        for ( int i=0;i<n;i++){
            sum = x + y;
            x = y;
            y = sum;
            System.out.print(sum + " " );
        }
    }
}

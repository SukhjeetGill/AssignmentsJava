import java.util.Scanner;
public class Factorial { public static int fact(int a){
    int fact=1;
    while (a>0){
        fact = fact * a;
        a--;
    }
    return fact;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        int fact = fact(a);
        System.out.println("Factorial is: " + fact);
    }
}

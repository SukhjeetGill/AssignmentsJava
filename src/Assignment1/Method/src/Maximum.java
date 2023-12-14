import java.util.Scanner;
public class Maximum {

    public static int max(int a,int b){
        if (a>b) return a;
        else return b;
    }
    public static int max(int a, int b ,int c){
        if ( a > b && a > c ) return a;
        else if ( b>c) return b;
        else return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the numbers a,b and c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = max (a,b);
        int max1 = max(a,b,c);
        System.out.println("Greater out of first a and b is: " + max);
        System.out.println("Greater out of first a, b and c is: " + max1);
    }
}

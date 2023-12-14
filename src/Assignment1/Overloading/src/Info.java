import java.util.Scanner;
public class Info {
    public static void info(int a){
        System.out.println("number entered is: " + a);
        System.out.println("it is integer");
    }
    public static void info(double a){
        System.out.println("number entered is: " + a);
        System.out.println("it has a decimal value");
    }
    public static void info(String a){
        System.out.println("number entered is: " + a);
        System.out.println("The length of string is: " + a.length());
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        double b = a;
        String s= String.valueOf(a);
        info(a);
        info(b);
        info(s);
    }
}

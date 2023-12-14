import java.util.Scanner;

public class Area {

    public static double calculateArea(int l, int w){
        double area = l*w;
        return area;
    }
    public static double calculateArea(int s){
        double area = s*s;
        return area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Enter 1 to calculate area of rectangle: ");
        System.out.println("2. Enter 2 to calculate area of square: ");
        int ch = sc.nextInt();
        if (ch == 1) {
            System.out.println("Enter the length: ");
            int l = sc.nextInt();
            System.out.println("Enter the width: ");
            int w = sc.nextInt();
            double area = calculateArea(l, w);
            System.out.println("Area of rectangle is: "+ area);
        }
        else if (ch==2) {
            System.out.println("Enter the side of square: ");
            int s = sc.nextInt();
            double area = calculateArea(s);
            System.out.println("Area of square is: "+ area);
        }
        else System.out.println("Invalid Input");
    }
}

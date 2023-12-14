import java.util.Scanner;

public class Circle {
    public static double area(double r)
    {
        double pie = 3.1415;
        double area =  pie* r * r;
        return area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double r = sc.nextDouble();
        double a = area(r);
        System.out.println("Area is: "+ a);
    }
}

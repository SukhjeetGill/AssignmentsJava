import java.util.Scanner;
public class Add {

    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static int add (int a, int b , int c){
        int sum = a +b +c;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int sum = add (x,y);
        int sum1 = add (x,y,z);
        System.out.println(sum);
        System.out.println(sum1);
    }
}

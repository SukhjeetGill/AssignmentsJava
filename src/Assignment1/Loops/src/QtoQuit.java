import java.util.Scanner;
public class QtoQuit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user value: ");
        System.out.println("Enter 'q' to quit");
        String a = new String();
        do {
            a = sc.nextLine();
        }while( !a.equals("q"));
    }
}

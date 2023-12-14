import java.util.Scanner;
public class Week {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("1. Enter 1 for Monday");
        System.out.println("2. Enter 2 for Tuesday");
        System.out.println("3. Enter 3 for Wednesday");
        System.out.println("4. Enter 4 for Thursday");
        System.out.println("5. Enter 5 for Friday");
        System.out.println("6. Enter 6 for Saturday");
        System.out.println("7. Enter 7 for Sunday");
        System.out.println("Enter the day of the week: ");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("It is a weekday");
                break;
            case 2:
                System.out.println("It is a weekday");
                break;
            case 3:
                System.out.println("It is a weekday");
                break;
            case 4:
                System.out.println("It is a weekday");
                break;
            case 5:
                System.out.println("It is a weekday");
                break;
            case 6:
                System.out.println("It is a weekend");
                break;
            case 7:
                System.out.println("It is a weekend");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}

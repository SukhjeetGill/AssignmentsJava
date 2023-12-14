import java.util.Scanner;
public class IfElseVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the age to check if voting eligibility: ");
        int age = sc.nextInt();
        if ( age >= 18){
            System.out.println("Person is eligible to vote");}
        else System.out.println("Not eligible to vote");
    }
}

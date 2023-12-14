package String;

import java.util.Scanner;
public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        int c= s.length();
        System.out.println("Length of string is: " + c);
    }
}
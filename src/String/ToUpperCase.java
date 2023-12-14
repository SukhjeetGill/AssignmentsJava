package String;

import java.util.Scanner;
public class ToUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.next();
        int c= s.length();
        s = s.toUpperCase();
        System.out.println("String in upper case is: " + s);
    }
}


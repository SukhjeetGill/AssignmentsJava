package String;

import java.util.Scanner;

public class Characters{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s =sc.nextLine();
        int c=s.length();
        int n=0;
        if (s.charAt(0)=='[' && s.charAt(c-1)==']'){
            n++;
        } else if (s.charAt(0)=='{' && s.charAt(c-1)=='}') {
            n++;
        } else if (s.charAt(0)=='(' && s.charAt(c-1)==')') {
            n++;
        }
        if (n>0) System.out.println("Is Valid");
        else System.out.println("Not valid");
    }
}

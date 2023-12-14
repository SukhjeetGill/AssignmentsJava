package String;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s=sc.nextLine();
        System.out.println("Enter the second string: ");
        String s2=sc.nextLine();
        int n=0;
        int e=s.length()-1;
        int e2=s2.length()-1;
        char c[]= s.toCharArray();
        char c2[]= s2.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c2);
        if (e!=e2)System.out.println("Not Anagram");
        else {
            for (int i = 0; i <=e; i++) {
                if (c[i]==c2[i]){
                    n++;
                }
            }
        }
        if (n==e+1) System.out.println("String is Anagram");
    }
}

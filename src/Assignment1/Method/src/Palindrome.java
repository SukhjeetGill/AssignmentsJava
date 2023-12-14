import java.util.Scanner;
public class Palindrome {
    public static String palindrome(int c,String s){
        String s2 = new String();
        for (int i = c-1; i >= 0;i--){
            s2 += s.charAt(i);
        }
        return s2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check: ");
        String s = sc.nextLine();
        int count = s.length();
        String s2 = palindrome(count,s);
        if (s.equals(s2)){
            System.out.println("Number is palindrome: " + s);
        }
        else System.out.println("Not a palindrome number ");
        System.out.println(s2);
    }
}

package Assignment3;

import java.util.Scanner;
public class Element {
    public void element() {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter array elements: ");
        int e = a.length - 1;
        for (int i=0;i<=e;i++) {
            a[i]=sc.nextInt();
        }
        int s=0;
        int value=0;
        System.out.println("Enter the number to find: ");
        int n = sc.nextInt();
        for (int i = 0; i <=e; i++) {
            if (n == a[i]) {
                s = n;
                value=i;
                System.out.println("Element is: " + s + " at: " + value + " position ");
            }
        }
        if (s==0) System.out.println("Number not found: ");


    }
}

package Assignment3;

import java.util.Scanner;
import java.util.Arrays;
public class EvenOdd {

    public void evenodd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length of 2d array: ");
        int l = sc.nextInt();
        int a[][] = new int[l][l];
        int b[] = new int[l * l];
        int c[] = new int[l * l];
        int d[] = new int[l * l];
        System.out.println("Enter array a elements: ");
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int count=0;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                b[count] = a[i][j];
                count++;
            }
        }
        int even = 0;
        int odd = 0;
        for (int i = 0; i < l*l; i++) {
            if (b[i] % 2 == 0) {
                c[even] = b[i];
                even++;
            } else {
                d[odd] = b[i];
                odd++;
            }
        }
        System.out.println("Even numbers are: ");
        for (int i = 0; i < even; i++) {
            System.out.println(c[i]);
        }
        System.out.println("Odd numbers are: ");
        for (int i = 0; i < odd; i++) {
            System.out.println(d[i]);
        }
    }
}

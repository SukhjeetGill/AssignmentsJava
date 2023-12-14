package Assignment3;

import java.util.Scanner;
public class GreatSmallNum {
    public void great() {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int l = a.length;
        int t = 0;
        System.out.println("Enter array elements: ");
        for (int i = 0; i < l; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                if (a[i] > a[j]) {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        int min = a[0];
        int max = a[l - 1];
        System.out.println("Largest element is: " + max);
        System.out.println("Smallest element is: " + min);
    }
}



















/*for (int i = 0; i < e; i++) {
            if (a[i] < s=a[]
                g= a[i];
            }
            j++;
            if (j >=e )
                j=j-1;
        }
        for (int i = 0; i < e; i++) {
            for (int j = 1; j < e; j++) {
                if ((a[i] > a[j])) {
                    g = a[i];
                }
                else s=a[i];
            }
        }
        for (int i = 0; i < e; i++) {
            for (int j = 0; j < e; j++) {
                if (!(a[i] >= a[j]))
                    s = a[i];
            }
        }*/


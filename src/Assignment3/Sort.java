package Assignment3;

import java.util.Arrays;
import java.util.Scanner;
public class Sort {
    public void sort() {
        Scanner sc = new Scanner(System.in);
        int a[] = {10, 20, 15, 70, 40};
        int l = a.length;
        int t = 0;
        System.out.println("Enter 1 to sort in accending order:");
        System.out.println("Enter 2 to sort in descending order:");
        int ch = sc.nextInt();
        if (ch ==1) {
            for (int i = 0; i < l; i++) {
                for (int j = i + 1; j < l; j++) {
                    if (a[i] > a[j]) {
                        t = a[i];
                        a[i] = a[j];
                        a[j] = t;
                    }
                }
            }
            System.out.println("Array elements in descending order: ");
            System.out.println(Arrays.toString(a));
        }
        else if (ch==2){
            for (int i = 0; i < l; i++) {
                for (int j = i + 1; j < l; j++) {
                    if (a[i] < a[j]) {
                        t = a[i];
                        a[i] = a[j];
                        a[j] = t;
                    }
                }
            }
            System.out.println("Array elements in accending order: ");
            System.out.println(Arrays.toString(a));
        }
    }
}

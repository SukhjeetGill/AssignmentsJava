package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class RevDiagonal {
    public void rev() {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int b[] = new int[3];
        System.out.println("Enter array a elements: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int l = a.length;
        System.out.println("Diagonal: ");
        for (int i = 0; i < l; i++) {
            for (int j = 0 ;j < l; j++) {
                if (i+j ==l-1 ){
                    b[i] = a[i][j];
                }
            }
        }
        System.out.println("Rev Diagonal is: ");
        System.out.println(Arrays.toString(b));
    }
}

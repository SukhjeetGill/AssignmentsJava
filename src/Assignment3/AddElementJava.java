package Assignment3;

import java.util.Scanner;
import java.util.Arrays;
public class AddElementJava {
    public void addelement(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length of 2d array: ");
        int l=sc.nextInt();
        int a[][] = new int[l][l];
        int b[] = new int[(l*l)+1];
        System.out.println("Enter array a elements: ");
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element to add: ");
        int num = sc.nextInt();
        int count=0;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                b[count] = a[i][j];
                count++;
            }
        }
        b[b.length-1]= num;

        System.out.println(Arrays.toString(b));
    }
}

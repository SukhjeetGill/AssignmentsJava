package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Original list: "+list);
        System.out.println("Enter the position: ");
        int a= sc.nextInt();
        System.out.println("Enter the element: ");
        int b = sc.nextInt();
        list.add(a,b);
        System.out.println("New List: " + list);
    }
}

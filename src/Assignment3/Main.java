package Assignment3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GreatSmallNum gret = new GreatSmallNum();
        Element es = new Element();
        RevDiagonal r = new RevDiagonal();
        Sort sr = new Sort();
        EvenOdd e = new EvenOdd();
        AddElementJava el = new AddElementJava();
        System.out.println("1.Enter 1 to find max/min: ");
        System.out.println("2.Enter 2 to find element: ");
        System.out.println("3.Enter 3 to sort: ");
        System.out.println("4.Enter 4 to find Rev diagonal: ");
        System.out.println("5.Enter 5 to find even/odd: ");
        System.out.println("6.Enter 6 to add element: ");

        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                gret.great();
                break;
            case 2:
                es.element();
                break;
            case 3:
                sr.sort();
                break;
            case 4:
                r.rev();
                break;
            case 5:
                e.evenodd();
                break;
            default:
                el.addelement();
        }
    }
}

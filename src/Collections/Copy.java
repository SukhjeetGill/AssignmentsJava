package Collections;

import java.util.ArrayList;
import java.util.List;

public class Copy {
    public static void main(String[] args) {
        List<Integer>  list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Original List: " + list);
        System.out.println("                Using method sublist              ");
        List<Integer> newlist = list.subList(0,3);
        System.out.println("Copied list 1: " +  newlist);

        System.out.println("                Using method .addall              ");
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(list);
        System.out.println("Copied list 2: " +  list2);

        System.out.println("                Using method copy constructor              ");
        List<Integer>  list3 = new ArrayList<>(list);
        System.out.println("Copied list 3: " +  list3);
    }
}

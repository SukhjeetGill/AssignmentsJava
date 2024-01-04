package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ToArray {
    public static void main(String[] args) {
        Set<String> names =  new HashSet<>();
        names.add("John");
        names.add("Michael");
        names.add("James");
        names.add("Steph");
        System.out.println("                Method 1                ");
        String a[] = new String[names.size()];
        names.toArray(a);
        for (String b:a){
        System.out.println(b);}
        System.out.println("                Method 2                ");
        Object b[] = names.toArray();
        for (Object ob: b){
            System.out.println(ob.toString());
        }
    }
}

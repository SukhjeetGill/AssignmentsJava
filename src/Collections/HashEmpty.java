package Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashEmpty {
    public static void main(String[] args) {
        Set<String> student= new HashSet<>();
        student.add("John");
        student.add("Michael");
        student.add("James");
        student.add("Steph");
        student.clear();
        System.out.println("                    Method 1:             ");
        if (student.size()==0){
            System.out.println("Set is empty");
        }
        else System.out.println("Set is not empty");
        System.out.println("                    Method 2:             ");
        Iterator<String> iterator = student.iterator();
        if (iterator.hasNext()){
            System.out.println("Set is not empty");
        }
        else System.out.println("Set is empty");
    }
}

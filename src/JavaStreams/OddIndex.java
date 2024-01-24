package JavaStreams;

import java.util.Arrays;
import java.util.List;

public class OddIndex {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(2, 4, 6, 8,9,12, 10, 12, 14, 16);
        int n = integers.indexOf(integers.stream()
                .filter(i -> i % 2 != 0)
                .findFirst()
//                .orElseThrow(() -> new RuntimeException("No odd number found")));
                .orElse(0));
        System.out.println("Index of first occurrence of odd: " + n);
        List <Integer> integerList = integers.subList(n+1,integers.size());
        System.out.println(integerList);

    }
}

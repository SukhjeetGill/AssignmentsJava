package JavaStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(9, 5, 34, 56, 2, 6, 10, 3, 4, 3, 6, 7, 3, 4);
        List<Integer> num = numbers.stream()
                .map(s -> s * s)
                .collect(Collectors.toList());
        System.out.println(num);
        Long count = numbers.stream().count();
        System.out.println("Count of numbers: " + count);
        Integer max = numbers.stream()
                .max(Comparator.comparing(i -> i))
                .orElse(null);
        System.out.println("Max is : " + max);
        Integer min = numbers.stream()
                .min(Comparator.naturalOrder())
                .orElse(null);
        System.out.println("Min is : " + min);
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sun is : " + sum);
        double average = sum / count;
        System.out.println("Average: " + average);
    }
}

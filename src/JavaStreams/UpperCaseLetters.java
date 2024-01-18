package JavaStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseLetters {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Dave");
        stringList.add("Joe");
        stringList.add("Ryan");
        stringList.add("Iyan");
        stringList.add("Ray");

        List<String> upperCaseNames = stringList.stream()
                .map(k -> k.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(upperCaseNames);

        List<Integer> wordLengths = stringList.stream()
                .map(k -> k.length())
                .collect(Collectors.toList());
        System.out.println(wordLengths);
    }
}

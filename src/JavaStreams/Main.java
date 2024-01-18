package JavaStreams;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> strlist = Arrays.asList("Pragra", "", "Software", "", "Java", "Spring"," ", "Shell");
        long str1 =strlist.stream()
                .filter(s -> s.isEmpty()).count();
        System.out.println("Empty strings: " +  str1);
        List<String> length4 = strlist.stream()
                .filter(s -> s.length()>4)
                .collect(Collectors.toList());
        System.out.println("Strings with length more than 4: " + length4);
        List <String> startswiths = strlist.stream()
                .filter(s -> s.startsWith("S"))
                .collect(Collectors.toList());
        System.out.println("Strings that starts wiht 'S' :" + startswiths );
        List <String> emptystrings = strlist.stream()
                .filter(s -> !(s.isEmpty()))
                .collect(Collectors.toList());
        System.out.println("Removed empty strings: " + emptystrings);
        List <String> twocharacter = strlist.stream()
                .filter(s -> s.length()>2)
                .collect(Collectors.toList());
        System.out.println("Strings with length more than 2: " + twocharacter);
        List <String> touppercase = strlist.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(touppercase);
    }
}

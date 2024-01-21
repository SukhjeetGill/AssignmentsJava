package JavaStreams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.stream.Stream;

public class Personlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> list = new ArrayList<>();
        list.add(new Person("Dave", 23, "India"));
        list.add(new Person("Joe", 18, "USA"));
        list.add(new Person("Ryan", 54, "Canada"));
        list.add(new Person("Iyan", 5, "India"));
        list.add(new Person("Ray", 63, "China"));
        System.out.println("Enter the country to check: ");
        String s = sc.next();
        List<String> ss = list.stream()
                .filter(person -> person.getCountry().equals(s))
                .map(person -> person.getName())
                .collect(Collectors.toList());
        System.out.println(ss);
        Optional<Person> first = list.stream()
                .filter(person -> person.getCountry().equals(s))
                .findFirst();
//        List <Integer> n = list.stream()
//                        .map(person -> person.getAge())
//                                .collect(Collectors.toList());
//        System.out.println(n);
//        int indexs = n.indexOf(n.stream()
//                .max(Comparator.naturalOrder())
//                .orElse(null));
//        System.out.println(indexs);
//        System.out.println(list.get(indexs));

        first.ifPresent(person -> System.out.println("First person in " + s + ": " + person.getName()));
        Long agemore = list.stream()
                .filter(person -> person.getAge() > 30)
                .count();
        System.out.println("Number with age >30 : " + agemore);
    }
}






//    List <Integer> n = list.stream()
//            .map(person -> person.getAge())
//            .collect(Collectors.toList());
//        System.out.println(n);
//                int indexs = n.indexOf(n.stream()
//                .max(Comparator.naturalOrder())
//                .orElse(null));
//                System.out.println(indexs);
//                System.out.println(list.get(indexs));
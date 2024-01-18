package JavaStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarList {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(1, "Toyota", "Highlander", "Mauv", 2008, 23736.62));
        carList.add(new Car(2, "Toyota", "Solara", "Fuscia", 2002, 66403.47));
        carList.add(new Car(3, "Ford", "Expedition EL", "Pink", 2010, 68973.04));
        carList.add(new Car(4, "Toyota", "Previa", "Indigo", 1997, 34881.54));
        carList.add(new Car(5, "Lexus", "SC", "Pink", 2010, 20900.33));
        carList.add(new Car(6, "Acura", "MDX", "Blue", 2005, 87249.54));
        carList.add(new Car(7, "Ford", "Econoline E250", "Pink", 2002, 33679.71));
        carList.add(new Car(8, "Lincoln", "Navigator L", "Yellow", 2009, 37768.38));
        double sumof = carList.stream()
                .mapToDouble(car -> car.getPrice())
                .sum();
        double aveg = sumof/carList.size();
        System.out.println("Average price is: "+ aveg);
        Long noofcar = carList.stream()
                .filter(car -> car.getMake().equals("Ford"))
                .count();
        System.out.println("Number of cars with Ford: " + noofcar);
        List<String> ty = carList.stream()
                .filter(car -> car.getMake().equals("Ford"))
                .map(car -> car.getModel())
                .collect(Collectors.toList());
        System.out.println(ty);
    }
}

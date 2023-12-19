package Interfaces;

public class Monkey implements Animal, Climbable {
    @Override
    public void feed() {
        System.out.println("Monkey eats bananas");
    }

    @Override
    public void climb() {
        System.out.println("Monkey can climb");
    }

    @Override
    public void makesound() {
        System.out.println("Monkey makes HO HO HOOO");
    }
}

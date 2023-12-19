package Interfaces;

public class Lion implements Animal{

    @Override
    public void feed() {
        System.out.println("Eats other animals");
    }

    @Override
    public void makesound() {
        System.out.println("Lion is roaring");
    }
}

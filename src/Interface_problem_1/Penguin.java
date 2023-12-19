package Interface_problem_1;

public class Penguin implements Animal,Swimmable{
    @Override
    public void feed() {
        System.out.println("eats");
    }

    @Override
    public void makesound() {
        System.out.println("HONK HONK");
    }

    @Override
    public void swim() {
        System.out.println("Penguin can swim");
    }
}

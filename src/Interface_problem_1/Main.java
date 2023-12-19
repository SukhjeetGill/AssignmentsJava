package Interface_problem_1;

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.feed();
        lion.makesound();
        Monkey monkey = new Monkey();
        monkey.feed();
        monkey.makesound();
        monkey.climb();
        Penguin penguin = new Penguin();
        penguin.feed();
        penguin.makesound();
        penguin.swim();
    }
}

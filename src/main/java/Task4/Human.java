package Task4;

public class Human {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Мурзик");

        cat.say("Привет, " + cat.getName());

        cat.feed();

        cat.runAway();
    }
}

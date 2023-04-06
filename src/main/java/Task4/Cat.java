package Task4;

public class Cat extends Animal {
    private boolean isHungry = true;

    @Override
    public void say(String message) {
        System.out.println("Мяу-мяу: " + message);
    }

    public void feed() {
        isHungry = false;
        System.out.println(getName() + " покормлен");
    }

    public void runAway() {
        System.out.println(getName() + " убежал");
    }
}


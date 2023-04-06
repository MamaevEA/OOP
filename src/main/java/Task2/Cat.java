package Task2;

class Cat {
    private boolean isHungry;

    public Cat() {
        isHungry = true;
    }

    public void respond() {
        System.out.println("Meow!");
    }

    public void reduceHunger() {
        isHungry = false;
        System.out.println("Cat is fed.");
    }
}


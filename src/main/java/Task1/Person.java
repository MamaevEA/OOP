package Task1;

// Модель человека
public class Person {
    private String name;
    private int age;
    private boolean isMale;

    public Person(String n, int a, boolean m) {
        this.name = n;
        this.age = a;
        this.isMale = m;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isMale() {
        return this.isMale;
    }
}
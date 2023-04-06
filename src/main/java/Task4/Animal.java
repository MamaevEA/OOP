package Task4;

public abstract class Animal implements Nameable, Voiceable {
    private String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}


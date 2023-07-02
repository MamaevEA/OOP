package OOP_Lesson_2_HW_1;

abstract class Hero implements Competitable {
    protected String type;

    public Hero(String type) {
        this.type = type;
    }

    public boolean run(int distance) {
        System.out.println(type + " бежит " + distance + " метров");
        return true;
    }

    public boolean jump(int height) {
        System.out.println(type + " прыгает на высоту " + height + " метров");
        return true;
    }
}

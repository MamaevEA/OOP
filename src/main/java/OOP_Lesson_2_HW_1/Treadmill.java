package OOP_Lesson_2_HW_1;

class Treadmill {
    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public boolean pass(Competitable competitable) {
        return competitable.run(distance);
    }
}

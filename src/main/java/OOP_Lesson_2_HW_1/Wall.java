package OOP_Lesson_2_HW_1;

class Wall {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public boolean pass(Competitable competitable) {
        return competitable.jump(height);
    }

}

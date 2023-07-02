package OOP_Lesson_2_HW_1;

public class Main {
    public static void main(String[] args) {
        Competitable[] participants = { new Human(), new Cat(), new Robot() };
        Object[] obstacles = { new Treadmill(500), new Wall(2) };

        for (Competitable participant : participants) {
            System.out.println("\nУчастник: " + participant.getClass().getSimpleName());

            boolean passedAllObstacles = true;

            for (Object obstacle : obstacles) {
                if (obstacle instanceof Treadmill) {
                    passedAllObstacles = ((Treadmill) obstacle).pass(participant);
                } else if (obstacle instanceof Wall) {
                    passedAllObstacles = ((Wall) obstacle).pass(participant);
                }

                if (!passedAllObstacles) {
                    break;
                }
            }

            if (passedAllObstacles) {
                System.out.println("Участник успешно прошел все препятствия!");
            } else {
                System.out.println("Участник не смог пройти все препятствия и выбывает из соревнований.");
            }
        }
    }
}

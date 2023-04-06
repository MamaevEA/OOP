package Task2;
// Подумать как описать логику взаимодействия человека и домашнего питомца.
// Сценарий: “Человек “зовёт” котика “кис-кис”, котик отзывается.
// Какое ещё взаимодействие может быть?

// Взаимодействие человека и котика можно описать следующим образом:
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Cat cat = new Cat();

        person.callCat(cat);
        person.feedCat(cat);
    }
}

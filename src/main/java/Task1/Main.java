package Task1;
// 1. Реализовать, с учетом ооп подхода, генеалогическое дерево Человек.
//Идея: описать некоторое количество компонент, например:
//модель человека
//компонента хранения связей и отношений между людьми: родитель, ребёнок - классика, но можно подумать и про отношение, брат, свекровь, сестра и т. д.
//компонент для проведения исследований
//дополнительные компоненты по желанию, например отвечающие за вывод данных в консоль, загрузку и сохранения в файл, получение\построение отдельных моделей человека
//Под “проведением исследования” можно понимать получение всех детей выбранного человека.
//Не обязательное

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person john = new Person("John", 32, true);
        Person mary = new Person("Mary", 28, false);
        Person sarah = new Person("Sarah", 5, false);
        Person jacob = new Person("Jacob", 3, true);

        Relationship r1 = new Relationship(john, mary, "spouse");
        Relationship r2 = new Relationship(john, sarah, "parent-child");
        Relationship r3 = new Relationship(john, jacob, "parent-child");
        Relationship r4 = new Relationship(mary, sarah, "parent-child");
        Relationship r5 = new Relationship(mary, jacob, "parent-child");

        ArrayList<Relationship> relationships = new ArrayList<>();
        relationships.add(r1);
        relationships.add(r2);
        relationships.add(r3);
        relationships.add(r4);
        relationships.add(r5);

        Research research = new Research(relationships);

        ArrayList<Person> johnsChildren = research.getChildren(john);
        for (Person p : johnsChildren) {
            System.out.println(p.getName());
        }
    }
}
package Task3;


import java.time.LocalDate;

public class Main {
    public static void Main(String[] args) {
        FamilyTreeImpl familyTree = new FamilyTreeImpl();

        Person mother = new PersonImpl("Anna", LocalDate.of(1970, 5, 20));
        Person father = new PersonImpl("John", LocalDate.of(1965, 10, 10));
        Person son = new PersonImpl("Ted", LocalDate.of(2000, 8, 15));
        Person daughter1 = new PersonImpl("Helen", LocalDate.of(1990, 3, 25));
        Person daughter2 = new PersonImpl("Lisa", LocalDate.of(1995, 12, 7));

        familyTree.addPerson(mother);
        familyTree.addPerson(father);
        familyTree.addPerson(son);
        familyTree.addPerson(daughter1);
        familyTree.addPerson(daughter2);

        familyTree.addFamilyRelation(mother, son);
        familyTree.addFamilyRelation(father, son);
        familyTree.addFamilyRelation(mother, daughter1);
        familyTree.addFamilyRelation(father, daughter1);
        familyTree.addFamilyRelation(mother, daughter2);
        familyTree.addFamilyRelation(father, daughter2);

        System.out.println("Parents of " + son.getName() + ": " + familyTree.getParents(son));
        System.out.println("Children of " + mother.getName() + ": " + familyTree.getChildren(mother));
    }
}
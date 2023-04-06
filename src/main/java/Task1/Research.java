package Task1;

import java.util.ArrayList;

// Компонента для проведения исследований
public class Research {
    private ArrayList<Relationship> relationships;

    public Research(ArrayList<Relationship> r) {
        this.relationships = r;
    }

    public ArrayList<Person> getChildren(Person parent) {
        ArrayList<Person> children = new ArrayList<>();
        for (Relationship r : relationships) {
            if (r.getPersonA().equals(parent) && r.getRelationshipType().equals("parent-child")) {
                children.add(r.getPersonB());
            } else if (r.getPersonB().equals(parent) && r.getRelationshipType().equals("parent-child")) {
                children.add(r.getPersonA());
            }
        }
        return children;
    }
}

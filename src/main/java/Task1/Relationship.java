package Task1;

// Компонента хранения связей и отношений между людьми
public class Relationship {
    private Person personA;
    private Person personB;
    private String relationshipType;

    public Relationship(Person a, Person b, String type) {
        this.personA = a;
        this.personB = b;
        this.relationshipType = type;
    }

    public Person getPersonA() {
        return this.personA;
    }

    public Person getPersonB() {
        return this.personB;
    }

    public String getRelationshipType() {
        return this.relationshipType;
    }
}


package Task3;

import java.util.List;

public interface FamilyTree {
    public void addPerson(Person person);
    public List<Person> getParents(Person person);
    public List<Person> getChildren(Person person);
}

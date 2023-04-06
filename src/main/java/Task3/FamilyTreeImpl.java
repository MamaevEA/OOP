package Task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FamilyTreeImpl implements FamilyTree {
    private Map<Person, List<Person>> familyTree;

    public FamilyTreeImpl() {
        familyTree = new HashMap<>();
    }

    @Override
    public void addPerson(Person person) {
        familyTree.put(person, new ArrayList<>());
    }

    @Override
    public List<Person> getParents(Person person) {
        List<Person> parents = new ArrayList<>();
        for (Map.Entry<Person, List<Person>> entry : familyTree.entrySet()) {
            List<Person> children = entry.getValue();
            if (children.contains(person)) {
                parents.add(entry.getKey());
            }
        }
        return parents;
    }

    @Override
    public List<Person> getChildren(Person person) {
        return familyTree.get(person);
    }

    public void addFamilyRelation(Person parent, Person child) {
        if (!familyTree.containsKey(parent)) {
            familyTree.put(parent, new ArrayList<>());
        }
        familyTree.get(parent).add(child);
    }
}

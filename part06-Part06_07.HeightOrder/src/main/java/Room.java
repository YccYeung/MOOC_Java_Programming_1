import java.util.ArrayList;

public class Room {
    
    private ArrayList<Person> list;
    

    public Room() {
        this.list = new ArrayList<>();
    }

    public void add(Person person) {
        list.add(person);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return list;
    }

    public Person shortest() {
        if (list.size() == 0) {
            return null;
        }

        Person person = this.list.get(0);

        for (Person i : list) {
            if (i.getHeight() < person.getHeight()) {
                person = i;
            }
        }

        return person;
    }

    public Person take() {
        if (list.size() == 0) {
            return null;
        }

        Person person = shortest();
        list.remove(person);
        return person;
    }
}

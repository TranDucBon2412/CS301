package OOP3;

import java.util.ArrayList;

public class PersonList {

    private ArrayList<Person> personList = new ArrayList<>();

    public PersonList() {
    }

    public void addPerson(Person person) {
        person.addPerson();
        personList.add(person);
        System.out.println("Added successfully!");
    }

    public void displayAll() {
        for (Person person : personList) {
            person.displayDetails();
            System.out.println("----------------");
        }
    }

    public Person findPersonById(String id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }

    public void deletePersonById(String id) {
        Person person = findPersonById(id);
        if (person != null) {
            personList.remove(person);
        }
    }

    public void updatePersonById(String id) {
        Person person = findPersonById(id);
        if (person != null) {
            person.updatePerson();
        }
    }
}

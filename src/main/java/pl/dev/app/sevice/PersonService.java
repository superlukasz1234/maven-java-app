package pl.dev.app.sevice;


import pl.dev.app.model.Person;
import pl.dev.app.repository.PersonsRepo;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    private List<Person> persons;

    public PersonService() {
        persons = PersonsRepo.getPersons();
    }

    public List<Person> getAllPersons() {
        return persons;
    }

    public Person addPerson(int id, String firstName, String lastName, int age) {
        Person person = new Person(id, firstName, lastName, age);
        persons.add(person);
        return person;
    }

    public List<Person> findById(int id) {
        List<Person> result = new ArrayList<>();
        for (Person p : persons){
            if (p.getId() == id){
                result.add(p);
            }
        }
        return result;
    }

    public boolean removeById(int id) {
        boolean result1 = true;
        List<Person> result = new ArrayList<>();
        for (Person p : persons){
            if (p.getId() == id){
               result.remove(p);
            }
        }
        return result1;
    }
}

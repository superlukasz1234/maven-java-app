package pl.dev.app.sevice;


import pl.dev.app.model.Address;
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

    public Person addPerson(String firstName, String lastName, int age, Address address) {
        int size = persons.size();
        int lastId = persons.get(size - 1).getId();
        Person person = new Person(++lastId, firstName, lastName, age, address);
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

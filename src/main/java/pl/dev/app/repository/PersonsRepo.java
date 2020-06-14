package pl.dev.app.repository;


import pl.dev.app.model.Address;
import pl.dev.app.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonsRepo {
    private static PersonsRepo personsRepo;
    private static final List<Person> persons = new ArrayList<>();

    private PersonsRepo() {
        persons.add(new Person(1, "e", "E", 55,new Address("dd","ff4","f")));
        persons.add(new Person(2, "f", "F", 48,new Address("dd","ff4","f")));
        persons.add(new Person(3, "g", "G", 33,new Address("dd","ff4","f")));
        persons.add(new Person(4, "h", "H", 29,new Address("dd","ff4","f")));
    }

    private List<Person> getList() {
        return persons;
    }

    public static List<Person> getPersons() {
        if (personsRepo == null) {
            personsRepo = new PersonsRepo();
        }

        return personsRepo.getList();
    }

}


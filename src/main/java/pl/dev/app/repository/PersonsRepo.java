package pl.dev.app.repository;


import pl.dev.app.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonsRepo {
    private static PersonsRepo personsRepo;
    private static final List<Person> persons = new ArrayList<>();

    private PersonsRepo() {
        persons.add(new Person(1, "e", "E", 55));
        persons.add(new Person(2, "f", "F", 48));
        persons.add(new Person(3, "g", "G", 33));
        persons.add(new Person(4, "h", "H", 29));
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


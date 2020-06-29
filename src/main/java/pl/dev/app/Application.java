package pl.dev.app;


import pl.dev.app.model.Address;
import pl.dev.app.model.Person;
import pl.dev.app.sevice.PersonService;
import pl.dev.app.sevice.ValidationService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    private static Scanner getNumber = new Scanner(System.in);
    private static Scanner getString = new Scanner(System.in);
    private static PersonService service;

    public static void main(String[] args) {

        service = new PersonService();

        showMenu();
        int number = getNumber.nextInt();
        do {
            switchFunction(number);
            showMenu();
            number = getNumber.nextInt();

        } while (number != 0);
        System.out.println("Koniec");
    }

    private static void switchFunction(int value) {

        List<Boolean> validationList = new ArrayList<>();
        switch (value) {
            case 1:
                service.getAllPersons().forEach(System.out::println);
                break;
            case 2:
                System.out.println("Podaj ID ktorego szukasz");
                int newId = getNumber.nextInt();
                service.findById(newId).forEach(System.out::println);
                break;
            case 3:
                System.out.println("Podaj dane osoby: ");
                System.out.println("Imie: ");
                String giveFirstName = getString.nextLine();
                validationList.add(ValidationService.validate(giveFirstName));
                System.out.println("Nazwisko: ");
                String giveLastName = getString.nextLine();
                System.out.println("Wiek: ");
                int giveAge = getNumber.nextInt();
                validationList.add(ValidationService.validate(giveAge));
                System.out.println("Ulice: ");
                String giveStreet = getString.nextLine();
                System.out.println("Numer domu: ");
                String giveHouseNumber = getString.nextLine();
                System.out.println("Miasto: ");
                String giveCity = getString.nextLine();
                Person person;
                if (checkCorrected(validationList)) {
                    person = service.addPerson(giveFirstName, giveLastName, giveAge, new Address(giveStreet, giveHouseNumber, giveCity));
                    System.out.println(person);
                } else {
                    System.out.println("jakieś pole jest chujowe");
                }

                validationList.removeAll(validationList);
                break;
            case 4:
                System.out.println("Podaj numer ID ktore chcesz usunąc");
                int newId1 = getNumber.nextInt();
                if (!service.removeById(newId1)) {
                    System.out.println("Nie znaleziono osoby o takim ID");
                }
                System.out.println("Znaleziono osobę o podanym ID i ją usunięto");
                break;
            default:
                System.out.println("Zla wartosc");
                break;
        }
    }

    private static void showMenu() {
        System.out.println();
        System.out.println("MENU");
        System.out.println("Wybierz 1, jeżeli chcesz wyświetlić osoby");
        System.out.println("Wybierz 2, jeżeli chcesz wyszukać osoby");
        System.out.println("Wybierz 3, jeżeli chcesz dodać osoby");
        System.out.println("Wybierz 4, jeżeli chcesz usunąć osoby");
        System.out.println("Wybierz 0, jeżeli chcesz wyjść");

    }

    private static boolean checkCorrected(List<Boolean> booleans) {
        boolean result = true;
        for (boolean b : booleans) {
            if (!b) {
                result = false;
            }
        }
        return result;
    }


}

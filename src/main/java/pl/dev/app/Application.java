package pl.dev.app;


import pl.dev.app.sevice.PersonService;

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
        switch (value) {
            case 1:
                service.getAllPersons().forEach(System.out::println);
                break;
            case 2:
                System.out.println("Podaj ID ktorego szukasz");
                int newId = getNumber.nextInt();
                service.findById(newId).forEach(System.out::println);
                break;
//            case 3:
//                System.out.println("Podaj dane osoby: ID, Imie, NAzwisko, wiek ");
//
//                service.addPerson(new Person()).forEach(System.out::println);
//                break;
            case 4:
                System.out.println("Podaj numer ID ktore chcesz usunąc");
                int newId1 = getNumber.nextInt();
                if (!service.removeById(newId1)){
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
}

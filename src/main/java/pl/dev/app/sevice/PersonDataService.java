package pl.dev.app.sevice;

import pl.dev.app.Application;

import java.util.Scanner;

public class PersonDataService {

    // metody ktore odpowiadaja za dodanie każdej wartości jak ponirzej
    public static String setFirstName() {
        System.out.println("Imie: ");
        String giveFirstName = new Scanner(System.in).nextLine();
        Application.validationList.add(ValidationService.validate(giveFirstName));

        return giveFirstName;
    }
}

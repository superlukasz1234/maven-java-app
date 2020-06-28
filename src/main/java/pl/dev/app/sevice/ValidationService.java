package pl.dev.app.sevice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationService {
    //sprawdza czy pole przekazalam jest puste czy jest null jeśli jest spacja to akcepyuje, sprzwdza czy zawiera spacje czy nul, numer domu
    // dwie metody String i int

    public static boolean validate(int value) {
        boolean result = true;
        if (value != ' ') {
            Pattern pattern = Pattern.compile("[0-9]+.");
        }
        result = false;
        return result;
    }

    public static boolean validate(String value) {
        Pattern pattern = Pattern.compile("[A-Z][a-z]+.[0-9]");
        Matcher matcher = pattern.matcher(value);
        return true;
    }
}

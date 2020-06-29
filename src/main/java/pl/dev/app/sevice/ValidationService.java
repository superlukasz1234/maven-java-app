package pl.dev.app.sevice;

public class ValidationService {
    //sprawdza czy pole przekazalam jest puste czy jest null jeśli jest spacja to akcepyuje, sprzwdza czy zawiera spacje czy nul, numer domu
    // dwie metody String i int

    public static boolean validate(int value) {
        if(value > 16 && value <100){
            return true;
        }
        return false;
    }

    public static boolean validate(String value) {
        return true;
    }
}

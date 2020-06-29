package pl.dev.app.sevice;

public class ValidationService {
    // lista validacji tutaj public static

    public static boolean validate(int value) {
        if(value > 16 && value <100){
            return true;
        }
        return false;
    }

    public static boolean validate(String value) {
        final boolean blank = value.isBlank(); // String x = "   ";
        final boolean empty = value.isEmpty(); // String x = "";
        return !blank;
    }

    public static boolean addressValidation(String value) {
        return true;
    }
}

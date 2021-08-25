package SimpleCalculator;

public class simpleCalculator {
    public static void validateNumber(String s) {
        if (s.length()>2)
            throw new RuntimeException("More than 2 numbers are not allowed");

    }
}

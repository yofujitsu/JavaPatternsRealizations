package NotPatterns.StringNotNullAndIsNotEmpty;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        String input = "Hello";

        Predicate<String> nullCheck = str -> str != null;
        Predicate<String> emptyCheck = str -> !str.isEmpty();

        Predicate<String> nullAndEmptyCheck = nullCheck.and(emptyCheck);

        boolean result = nullAndEmptyCheck.test(input);
        System.out.println(result); // Выводит true
    }
}

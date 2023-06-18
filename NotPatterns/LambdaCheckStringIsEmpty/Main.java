package NotPatterns.LambdaCheckStringIsEmpty;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        String input = "Hello";

        Predicate<String> nonEmptyCheck = str -> !str.isEmpty();
        boolean result = nonEmptyCheck.test(input);

        System.out.println(result); // Выводит true
    }
}

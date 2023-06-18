package NotPatterns.LambdaTrueIfStringNotNull;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        String input = "Hello";

        Predicate<String> nullCheck = str -> str != null;
        boolean result = nullCheck.test(input);

        System.out.println(result); // Выводит true
    }
}


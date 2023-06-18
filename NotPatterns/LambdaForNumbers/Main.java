package NotPatterns.LambdaForNumbers;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        int number = 2;

        Function<Integer, String> numberCheck = n -> {
            if (n > 0) {
                return "Положительное число";
            } else if (n < 0) {
                return "Отрицательное число";
            } else {
                return "Ноль";
            }
        };

        String result = numberCheck.apply(number);
        System.out.println(result);
    }
}

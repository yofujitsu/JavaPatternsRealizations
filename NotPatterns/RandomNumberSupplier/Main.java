package NotPatterns.RandomNumberSupplier;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Integer> randomNumber = () -> {
            Random random = new Random();
            return random.nextInt(11);
        };

        int result = randomNumber.get();
        System.out.println(result); // Выводит случайное число от 0 до 10
    }
}


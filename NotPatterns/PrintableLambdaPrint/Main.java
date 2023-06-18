package NotPatterns.PrintableLambdaPrint;

import java.time.LocalDateTime;

interface Printable {
    void print();
}

public class Main {
    public static void main(String[] args) {
        Printable printable = () -> {
            System.out.println("Текущая дата и время: " + LocalDateTime.now());
        };
        printable.print();
    }
}
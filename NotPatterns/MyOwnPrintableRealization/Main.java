package NotPatterns.MyOwnPrintableRealization;

@FunctionalInterface
interface Printable {
    void print();
}

class Printer {
    public static void printHello() {
        System.out.println("Hello, world!");
    }
}

public class Main {
    public static void main(String[] args) {
        Printable printable = Printer::printHello;
        printable.print(); // Выводит "Hello, world!"
    }
}


package NotPatterns.DeleteEveryFifthFromArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");
        list.add("Element 4");
        list.add("Element 5");
        list.add("Element 6");
        list.add("Element 7");
        list.add("Element 8");
        list.add("Element 9");
        list.add("Element 10");

        list.stream()
                .filter(element -> (list.indexOf(element) + 1) % 5 != 0)
                .forEach(System.out::println);
    }
}

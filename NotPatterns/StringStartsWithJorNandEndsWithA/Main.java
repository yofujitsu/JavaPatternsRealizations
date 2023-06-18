package NotPatterns.StringStartsWithJorNandEndsWithA;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        String s1 = "JellA";
        String s2 = "JellO";
        String s3 = "NellO";
        String s4 = "NellA";

        Predicate<String> firstSymb = str -> str.startsWith("J") || str.startsWith("N");
        Predicate<String> lastSymb = str -> str.endsWith("A");

        Predicate<String> firstLastCheck = firstSymb.and(lastSymb);

        boolean res1 = firstLastCheck.test(s1);
        boolean res2 = firstLastCheck.test(s2);
        boolean res3 = firstLastCheck.test(s3);
        boolean res4 = firstLastCheck.test(s4);

        List<Boolean> res = new ArrayList<>();
        res.add(res1);
        res.add(res2);
        res.add(res3);
        res.add(res4);
        res.forEach(System.out::println);
    }
}

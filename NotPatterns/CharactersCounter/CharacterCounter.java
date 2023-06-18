package NotPatterns.CharactersCounter;

import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No input strings provided.");
            return;
        }

        Map<Character, Integer> characterCountMap = new HashMap<>();

        for (String inputString : args) {
            for (char c : inputString.toCharArray()) {
                characterCountMap.put(c, characterCountMap.getOrDefault(c, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : characterCountMap.entrySet()) {
            System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }
}

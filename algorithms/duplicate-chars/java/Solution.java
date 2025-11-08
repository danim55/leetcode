import java.util.*;

public class RepeatedCharacters {
    public static void main(String[] args) {
        char[] chars = {'c', 'a', 'i', 'o', 'p', 'a'};
        List<Character> result = findRepeated(chars);
        System.out.println(result);
    }

    public static List<Character> findRepeated(char[] chars) {
        Map<Character, Integer> freq = new HashMap<>();

        // Count frequency of each character
        for (char c : chars) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Collect characters appearing at least twice
        List<Character> repeated = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() >= 2) {
                repeated.add(entry.getKey());
            }
        }

        return repeated;
    }
}

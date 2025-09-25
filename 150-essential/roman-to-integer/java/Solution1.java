import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = Map.of(
                'I', 1, 'V', 5, 'X', 10,
                'L', 50, 'C', 100, 'D', 500, 'M', 1000);

        int intValue = 0;
        intValue += s.charAt(0);
        for (int i = 1; i < s.length(); i++) {

            char character = s.charAt(i);

            if (character < s.charAt(i - 1)) {

            }
        }

        return intValue;
    }
}
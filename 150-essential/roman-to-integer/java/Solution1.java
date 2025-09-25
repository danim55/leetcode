import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = Map.of(
                'I', 1, 'V', 5, 'X', 10,
                'L', 50, 'C', 100, 'D', 500, 'M', 1000);

        int intValue = 0;
        for (int i = 0; i < s.length(); i++) {

            char character = s.charAt(i);

            if (character < s.charAt(i + 1)) {
                intValue -= map.get(character);
            } else {
                intValue += map.get(character);
            }
        }

        return intValue;
    }
}
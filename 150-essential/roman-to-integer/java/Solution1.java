import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = Map.of(
                'I', 1, 'V', 5, 'X', 10,
                'L', 50, 'C', 100, 'D', 500, 'M', 1000);

        int intValue = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int current = map.get(s.charAt(i));
            int next = i + 1 > s.length() ? map.get(s.charAt(i + 1)) : 0;

            if (current < next) {
                intValue -= current;
            } else {
                intValue += current;
            }
        }

        return intValue;
    }
}
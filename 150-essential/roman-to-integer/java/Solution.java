class Solution {
    public int romanToInt(String s) {
        int integerValue = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'I' -> {
                    if (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X') {
                        integerValue -= 1;
                    } else {
                        integerValue += 1;
                    }
                }
                case 'V' -> integerValue += 5;
                case 'X' -> {
                    if (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C') {
                        integerValue -= 10;
                    } else {
                        integerValue += 10;
                    }
                }
                case 'L' -> integerValue += 50;
                case 'C' -> integerValue += 100;
                case 'D' -> integerValue += 500;
                case 'M' -> integerValue += 1000;
                default -> {
                }
            }
        }

        return integerValue;
    }
}
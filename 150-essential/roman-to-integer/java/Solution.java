class Solution {
    public int romanToInt(String s) {
        int integerValue = 0;

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            char next = 0;
            if (i < s.length() - 1) {
                next = s.charAt(i+1);
            }
            switch (current) {
                case 'I' -> {
                    if (next == 'V' || next == 'X') {
                        integerValue -= 1;
                    } else {
                        integerValue += 1;
                    }
                }
                case 'V' -> integerValue += 5;
                case 'X' -> {
                    if (next == 'L' || next == 'C') {
                        integerValue -= 10;
                    } else {
                        integerValue += 10;
                    }
                }
                case 'L' -> integerValue += 50;
                case 'C' -> {
                    if (next == 'D' || next == 'M') {
                        integerValue -= 100;
                    } else {
                        integerValue += 100;
                    }
                }
                case 'D' -> integerValue += 500;
                case 'M' -> integerValue += 1000;
                default -> {
                }
            }
        }

        return integerValue;
    }
}
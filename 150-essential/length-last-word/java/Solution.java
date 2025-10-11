class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        boolean condition = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            }

            if (s.charAt(i) == ' ') {
                condition = true;
            }

            if (s.charAt(i) == ' ' && condition && length > 0) {
                break;
            }   
        }
        return length;
    }
}
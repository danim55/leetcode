class Solution {
    public int lengthOfLastWord(String s) {
        int endOfWord = s.length() - 1;
        int length = 0;
        boolean word = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ' && !word) {
                word = true;
                endOfWord = i;
                System.out.println(endOfWord);
            }
            System.out.println(s.charAt(i));
            System.out.println(word);
            if (word && s.charAt(i) == ' ') {
                length = s.substring(i, endOfWord).length();
                System.out.println(length);
                System.out.println(s.substring(i,endOfWord));
                break;
            }
        }
        return length;
    }
}
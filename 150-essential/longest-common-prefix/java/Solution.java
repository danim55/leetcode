import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String common = "";
        String longerWord = "";
        int index = 0;

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() > longerWord.length()) {
                longerWord = strs[i];
                index = i;
            }
        }
        strs[index] = strs[strs.length - 1];
        Arrays.copyOf(strs, strs.length - 1);
        for (String str : strs) {
            System.out.println(strs[0].length());
            for (int j = 0; j < str.length() - 1; j++) {
                if (str.charAt(j) != longerWord.charAt(j) || common.length() > j) {
                    break;
                }
                common += str.charAt(j);
            }
        }
        return common;
    }
}
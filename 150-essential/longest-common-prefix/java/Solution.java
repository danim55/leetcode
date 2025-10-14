class Solution {
    public String longestCommonPrefix(String[] strs) {
        String common = "";
        String longerWord = "";

        for (String str : strs) {
            if (str.length() > longerWord.length()) {
                longerWord = str;
            }
        }
        for (String str : strs) {
            System.out.println(strs[0].length());
            for (int j = 0; j < str.length() - 1; j++) {
                if (str.charAt(j) != longerWord.charAt(j)) {
                    break;
                }
                common += str.charAt(j);
            }
        }
        return common;
    }
}
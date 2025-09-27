import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        int hIndex = 0;
        Arrays.sort(citations);

        // [3,0,6,1,5]
        // [0,1,3,5,6]

        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= i + 1) {
                hIndex = citations[i];
            }
        }

        return hIndex;
    }
}
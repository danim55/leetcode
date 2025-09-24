import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        return Math.round(Arrays.stream(citations).sum() / citations.length);
    }
}
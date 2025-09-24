import java.util.ArrayList;
import java.util.List;

class Solution {
    public int hIndex(int[] citations) {
        int hIndex = 0;
        int citationsNumber = citations.length;
        int candidate = 0;
        List<Integer> currentArray = new ArrayList<>();

        for (int i = 0; i < citationsNumber; i++) {
            currentArray.add(citations[i]);
            if (Math.round(currentArray.stream().mapToDouble(a -> a).average().getAsDouble()) > currentArray.size()) {
                hIndex = candidate;
            }
            candidate++;
        }
        return hIndex;
    }
}
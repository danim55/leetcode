class Solution {
    public int hIndex(int[] citations) {
        int hIndex = 0;
        int numPapers = 0;

        for (int j = 1; j < citations.length + 1; j++) {

            for (int i = 0; i < citations.length; i++) {
                if (citations[i] >= j) {
                    numPapers++;
                }
                if (numPapers >= j) {
                    hIndex = j;
                    break;
                }
            }
            numPapers = 0;
        }

        return hIndex;
    }
}
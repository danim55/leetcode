class Solution {
    public int hIndex(int[] citations) {
        int hIndex = 0;
        int[] numberOfCitations = new int[citations.length + 1];

        for (int i = 0; i < numberOfCitations.length; i++) {
            if (citations[i] > citations.length) {
                numberOfCitations[numberOfCitations.length - 1]++;
            } else {
                numberOfCitations[citations[i]]++;
            }
        }

        System.out.println(String.valueOf(numberOfCitations));

        int counter = 0;
        for (int j = numberOfCitations.length; j > 0; j--) {
            counter += numberOfCitations[j];
            if (counter >= j) {
                hIndex = j;
            }
        }

        return hIndex;
    }
}
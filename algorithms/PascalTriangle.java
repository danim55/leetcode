class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List auxiliarList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                auxiliarList.add(1);
            }
            pascalTriangle.add(auxiliarList);
        }

        for (int i = 2; i < numRows; i++) {
            for (int j = 1; j < i; j++) {
                var previousList = pascalTriangle.get(i - 1);
                int valueCalculated = previousList.get(j - 1) + previousList.get(j);
                pascalTriangle.get(i).set(j, valueCalculated);
            }
        }

        return pascalTriangle;
    }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    // First solution
    public static List<List<Integer>> generateFirstTry(int numRows) {
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

    // Final solution
    public static List<List<Integer>> generateSecondTry(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prev = triangle.get(i - 1);
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(prev.get(j - 1) + prev.get(j));
            }
            row.add(1);
            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String args[]) {
        generateSecondTry(5);
    }
}
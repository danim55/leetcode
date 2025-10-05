
import java.util.HashMap;

class RandomizedSet {

    private final HashMap<Integer, Integer> randomNumbers;

    public RandomizedSet() {
        this.randomNumbers = new HashMap<>();
    }

    public boolean insert(int val) {
        if (randomNumbers.containsKey(val)) {
            return false;
        } else {
            randomNumbers.put(val, val);
            return true;
        }
    }

    public boolean remove(int val) {
        if (randomNumbers.containsKey(val)) {
            randomNumbers.remove(val);
            return true;
        } else {
            return false;
        }
    }

    public int getRandom() {

    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class RandomizedSet {

    private final Map<Integer, Integer> randomMap;
    private final List<Integer> randomList;

    public RandomizedSet() {
        this.randomMap = new HashMap<>();
        this.randomList = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (randomMap.containsKey(val)) {
            return false;
        } else {
            randomList.add(val);
            randomMap.put(randomList.size(), val);
            return true;
        }
    }

    public boolean remove(int val) {
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

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
        }

        randomList.add(val);
        randomMap.put(val, randomList.size() - 1);

        return true;
    }

    public boolean remove(int val) {
        if (!randomMap.containsKey(val)) {
            return false;
        }
        randomList.remove(randomMap.get(val));
        randomMap.remove(val);
        return true;
    }

    public int getRandom() {
        return randomList.get(new Random().nextInt());
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
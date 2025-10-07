import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class RandomizedSet {

    private final HashMap<Integer, Integer> randomMap;
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
        int indexToRemove = randomMap.get(val);
        // We assign the last value of the list to the index of the map that is going to
        // be removed
        randomMap.put(randomList.get(randomList.size() - 1), indexToRemove);
        // We remove the value from the map
        randomMap.remove(val);
        // We update the list seting the last value of the list to the index that is
        // going to be removed
        randomList.set(indexToRemove, randomList.get(randomList.size() - 1));
        // We remove the value received from the list
        randomList.remove(randomList.size() - 1);
        return true;
    }

    public int getRandom() {
        int index = (int) (Math.random() * randomList.size());
        return randomList.get(index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
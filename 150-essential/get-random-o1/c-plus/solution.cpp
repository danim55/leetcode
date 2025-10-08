class RandomizedSet {
   public:
    vector<int> values;
    map<int, int> valuesIndex;

    RandomizedSet() {
        values = {};
        valuesIndex = {};
    }

    bool insert(int val) {
        if (valuesIndex.find(val) != valuesIndex.end()) {
            return false;
        }

        values.insert(values.end() - 1, val);
        valuesIndex.insert({values.size() - 1, val});

        return true;
    }

    bool remove(int val) {
        if ( valuesIndex.find(val) == valuesIndex.end()) {
            return false;
        }

        int indexToRemove = valuesIndex.at(val);
        // Change the value of the index to delete by the current last item of
        // the list
        valuesIndex[indexToRemove] = values.at(values.size() - 1);
        // Erase the value received from the map
        valuesIndex.erase(val);
        // Move the value to be removed to the end of the list
        values[indexToRemove] = values[values.size() - 1];
        values.pop_back();

        return true;
    }

    int getRandom() {
        int r = rand() % values.size() - 1;
        return values[r];
    }
};
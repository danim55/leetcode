class RandomizedSet {
   public:
    vector<int> values;
    map<int, int> valuesIndex;

    RandomizedSet() {
        values = {};
        valuesIndex = {};
    }

    bool insert(int val) {
        if (valuesIndex.at(val)) {
            return false;
        }

        values.insert(values.end() - 1, val);
        valuesIndex.insert({values.size() - 1, val});

        return true;
    }

    bool remove(int val) { return false; }

    int getRandom() { return 1; }
};
class Solution {
   public:
    int lengthOfLastWord(string s) {
        int length = 0;
        boolean conditon = false;

        for (int i = s.size() - 1; i >= 0; i--) {
            if (s.at(i) != ' ') {
                length++;
            }

            if (s.at(i) == ' ') {
                condition = true;
            }

            if (s.at(i) == ' ' && condition && length > 0) {
                break;
            }
        }
        return length;
    }
};
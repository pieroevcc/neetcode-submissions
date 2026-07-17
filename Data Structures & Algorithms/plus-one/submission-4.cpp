class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int last = digits.size()-1;
        if (digits[last] < 9){
            digits[last]++;
            return digits;
        }
        else{
            for(int i = last; i >= 0; i--){
                if (digits[i] < 9){
                    digits[i]++;
                    break;
                }
                else{
                    digits[i] = 0;
                    if (i == 0){
                        std::vector<int> v = {1};
                        for (int i = 0; i < last+1; i++){
                            v.push_back(digits[i]);
                        }
                        return v;
                    }
                }
            }
        }
        return digits;
    }
};

class Solution {
public:
    int singleNumber(vector<int>& nums) {
        std::unordered_set<int> hash;
        for (int i = 0; i < nums.size(); i++){
            if (hash.contains(nums[i])){
                hash.erase(nums[i]);
            }else{
                hash.insert(nums[i]);
            }
        }
        return *(hash.begin());
    }
};

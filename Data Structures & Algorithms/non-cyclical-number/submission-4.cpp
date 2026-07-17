class Solution {
public:
    std::unordered_set<int> v;
    bool isHappy(int n) {
        if (v.contains(n)) return false;
        std::string s = std::to_string(n);
        const char* c = s.c_str();
        int sum = 0;
        for (int i = 0; i < s.length(); i++){
            sum += pow(c[i] - '0', 2);
        }
        v.emplace(n);
        if (sum != 1){
            return isHappy(sum);
        }else{
            return true;
        }
    }
};

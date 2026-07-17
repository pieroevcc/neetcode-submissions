class Solution {
public:
    std::vector<int> v;
    bool isHappy(int n) {
        for (int i = 0; i < v.size(); i++){
            if (v[i] == n){
                return false;
            }
        }
        std::string s = std::to_string(n);
        const char* c = s.c_str();
        int sum = 0;
        for (int i = 0; i < s.length(); i++){
            sum += pow(c[i] - '0', 2);
        }
        v.push_back(n);
        if (sum != 1){
            return isHappy(sum);
        }else{
            return true;
        }
    }
};

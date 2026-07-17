class Solution {
public:
    double myPow(double x, int n) {
        double res = x;
        if (n < 0){
            int pow = x;
            for (int i = n; i <= 0; i++){
                pow *= x;
                res /= x;
            }
            return res;
        }
        else if (n > 0){
            for (int i = 1; i < n; i++){
                res *= x;
            }
            return res;
        }
        else return 1;
    }
};

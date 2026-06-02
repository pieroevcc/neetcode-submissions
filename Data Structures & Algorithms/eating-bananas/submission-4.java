class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int high = Arrays.stream(piles).max().getAsInt(); //upper bound for k;
        int low = 1; //lower bound 
        int res = 0;
        while (low <= high){
            int k = low + (high-low)/2;
            int total = 0;
            for(int i = 0; i < piles.length; i++){
                total += (piles[i] + k -1) /k;
            }
            if (total <= h){
                res = k;
                high = k -1;
            }
            else {
                low = k +1;
            }
        }
        return res;
    }
}

class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int[] best = new int[3];
        for (int i = 0; i < triplets.length; i++){
            int a1 = triplets[i][0];
            int b1 = triplets[i][1];
            int c1 = triplets[i][2];
            if (a1 <= target[0] && b1 <= target[1] && c1 <= target[2]){
                best[0] = Math.max(a1, best[0]);
                best[1] = Math.max(b1, best[1]);
                best[2] = Math.max(c1, best[2]);
            }
            
        }
        boolean t = true;
        for (int k = 0; k < 3; k++){
            if(best[k] != target[k]) t = false;
        }

        return t;
    }
}

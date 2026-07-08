class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (Arrays.stream(gas).sum() < Arrays.stream(cost).sum()) {
            return -1;
        }
        int currtank = 0;
        int start = 0;

        for(int i = 0; i < gas.length; i++){
            currtank += gas[i] - cost[i];
            if (currtank < 0){
                start = i+1;
                currtank =0;
            }
        }

        return start;
          
    }

   
}

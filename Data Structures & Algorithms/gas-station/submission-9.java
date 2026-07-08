class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (gas.length == 1) return (gas[0] - cost[0] >= 0) ? 0 : -1;
        int totalgas = 0;
        int totalcost = 0;
        int currtank = 0;
        int start = 0;

        for(int i = 0; i < gas.length; i++){
            totalgas += gas[i];
            totalcost += cost[i];
            currtank += gas[i] - cost[i];

            if (currtank < 0){
                start = i+1;
                currtank =0;
            }
        }

        if(totalcost > totalgas){
            return -1;
        }

        return start;
          
    }

   
}

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (gas.length == 1) return (gas[0] - cost[0] >= 0) ? 0 : -1;
        int startidx = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < gas.length; i++){
            if (gas[i] - cost[i] > 0){
                startidx = i;
                list.add(startidx);
            }
        }
        if (list.isEmpty()) return -1;
        for (int i = 0; i< list.size(); i++){
            int res = rec(gas, cost, list.get(i));
            if(res >= 0){
                return res;
            }
        }
        return -1;
          
    }

    public int rec(int[] gas, int[] cost, int start){
        int total = gas[start];
        int costTravel = cost[start];
        for(int i = 0; i < gas.length; i++){
            start++;
            if (start >= gas.length){
                start = 0;
            }
            total -= costTravel;
            if (total < 0) return -1;
            total += gas[start];
            costTravel = cost[start];
        }   
        return start;
    }
}

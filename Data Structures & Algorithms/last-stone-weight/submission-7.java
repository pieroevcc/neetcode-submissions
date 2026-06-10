class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < stones.length; i++){
            max.add(stones[i]);
        }

        int weight = max.poll();
        while(!max.isEmpty()){
            int curr = max.poll();
            if (weight == curr){
                weight = weight - curr;
            }
            else if (weight > curr){
                max.add(weight-curr);
                weight = max.poll();
            }
            else{
                weight = curr;
            }
        }
        return weight;
    }
}

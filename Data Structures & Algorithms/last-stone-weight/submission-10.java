class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < stones.length; i++){
            max.offer(stones[i]);
        }

        while(max.size() > 1){
            int first = max.poll();
            int second = max.poll();
            if(first > second){
                max.offer(first-second);
            }
        }
        
        max.offer(0);
        return max.peek();
    }
}

class KthLargest {

    int size = 0;
    PriorityQueue<Integer> max = new PriorityQueue<>(); 
    public KthLargest(int k, int[] nums) {
        size = k;
        for(int i = 0; i < nums.length; i++){
            max.offer(nums[i]);
            if (max.size() > k){
                max.poll();
            }
        }
    }
    
    public int add(int val) {
        max.offer(val);
        if (max.size() > size){
            max.poll();
        }
        return max.peek();
    }
}

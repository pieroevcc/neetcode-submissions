class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //get freq of each
        for(int i = 0; i <nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer>[] list = new List[nums.length+1];
        for(int n : map.keySet()){
            int freq = map.get(n);
            if (list[freq] == null) list[freq] = new ArrayList<>();
            list[freq].add(n);
        }
        int[] res = new int[k];
        int counter = 0;
        for(int i = list.length-1; i>=0 && counter < k; i--){
            if (list[i] !=null){
                for (int num :list[i]){
                    res[counter++] = num;
                    if (counter == k) return res;
                }
            }
        }
        return res;
    }   
}

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));

        for(int i = 0; i < points.length; i++){
            int d = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            heap.add(new int[]{d, points[i][0], points[i][1]});
            if(heap.size() > k){
                heap.poll();
            }
        }
        int[][] res = new int[k][2];
        for(int i = 0; i < k; i++){
            int top[] = heap.poll();
            res[i] = new int[]{top[1], top[2]};
        }
        return res;
    }
}

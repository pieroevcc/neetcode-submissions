class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 1) return intervals;

        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        int left = intervals[0][0];
        int right = intervals[0][1];
        for (int i = 1; i < intervals.length; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            if (right < start){
                list.add(new int[] {left, right});
                left = start;
                right = end;
            }
            else if (left > end){
                list.add(intervals[i]);
            }
            else{
                left = Math.min(left, start);
                right = Math.max(right, end);
            }

        }
        list.add(new int[] {left, right});
        return list.toArray(new int[0][]);

    }
}

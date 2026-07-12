class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 1) return 0;
        int count = 0;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        int right = intervals[0][1];
        for (int i = 1; i < intervals.length; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            if (right > start){
                count++;
                right = Math.min(right, end);
            }
            else{
                right = end;
            }
        }

        return count;
    }
}

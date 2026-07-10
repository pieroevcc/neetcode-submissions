class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0) return new int[][] {newInterval};
        List<int[]> list = new ArrayList<>();
        int left = newInterval[0];
        int right = newInterval[1];
        boolean merge = false;
        for (int i = 0; i < intervals.length; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            if (end < left){
                list.add(new int[] {start, end});
                continue;
            }
            else if (start > right){
                //safe to append newInterval and after
                if (!merge){
                    list.add(new int[] {left, right});
                    merge = true;
                }
                list.add(new int[] {start, end});
            }
            else {
                // overlap
                left = Math.min(left, start);
                right = Math.max(right, end);
            }
        }
        if (!merge) list.add(new int[] {left, right});
        return list.toArray(new int[0][]);
    }
}

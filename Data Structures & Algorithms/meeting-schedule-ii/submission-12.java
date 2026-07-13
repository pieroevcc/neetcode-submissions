/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int[] starts = intervals.stream().mapToInt(interval -> interval.start).sorted().toArray();
        int[] ends = intervals.stream().mapToInt(interval -> interval.end).sorted().toArray();
        int start = 0;
        int end = 0;
        int count = 0;
        int max = 0;
        int len = starts.length;
        while(start < len && end < len){
            if (starts[start] < ends[end]){
                count++;
                start++;
            }else{
                end++;
                count--;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}

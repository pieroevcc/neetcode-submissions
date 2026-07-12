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
    public boolean canAttendMeetings(List<Interval> intervals) {
        if (intervals.size() == 0) return true;
        intervals.sort(Comparator.comparingInt(interval -> interval.start));
        for(int i = 1; i < intervals.size(); i++){
            int right = intervals.get(i-1).end;
            int start = intervals.get(i).start;
            int end = intervals.get(i).end;
            if (right > start){
                return false;
            }
        }
        return true;
    }
}

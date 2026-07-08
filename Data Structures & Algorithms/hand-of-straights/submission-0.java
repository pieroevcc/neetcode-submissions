class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (groupSize == 1) return true;
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i = 0; i < hand.length; i++){
            freq.put(hand[i], freq.getOrDefault(hand[i], 0) + 1);
        }
        Arrays.sort(hand);
        for(int i = 0; i < hand.length; i++){
            if (freq.get(hand[i]) > 0) {
                for(int j = 0; j < groupSize; j++){
                    if (freq.getOrDefault(hand[i] + j, 0) == 0) return false;
                    freq.put(hand[i]+j, freq.get(hand[i] + j)-1);
                    
                }
            }
        }
        return true;
    }
}

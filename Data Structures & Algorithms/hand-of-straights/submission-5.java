class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) return false;
        Map<Integer,Integer> freq = new TreeMap<>();
        for(int i = 0; i < hand.length; i++){
            freq.put(hand[i], freq.getOrDefault(hand[i], 0) + 1);
        }
        for(int i : freq.keySet()){
            while (freq.get(i) > 0) {
                for(int j = 0; j < groupSize; j++){
                    if (freq.getOrDefault(i + j, 0) == 0) return false;
                    freq.put(i+j, freq.get(i + j)-1);
                }
            }
        }
        return true;
    }
}

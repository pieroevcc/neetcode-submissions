class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0;
        int maxrep = 0;
        int maxlen = 0;
        for(int right = 0; right < s.length(); right++){
            char rchar = s.charAt(right);
            freq[rchar - 'A']++;
            maxrep = Math.max(maxrep, freq[rchar - 'A']);
            if ((right - left + 1) - maxrep > k){
                char lchar = s.charAt(left);
                freq[lchar - 'A']--;
                left++;
            }
            maxlen = Math.max(maxlen, right - left + 1);
        }
        return maxlen;
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        String sub = "";
        int max = 0;
        for (char c : s.toCharArray()) {
            int duplicateIndex = sub.indexOf(c);
            if (duplicateIndex != -1) {
                sub = sub.substring(duplicateIndex + 1);
            }
            sub += c;
            if (sub.length() > max) {
                max = sub.length();
            }
        }
        return max;
    }
}
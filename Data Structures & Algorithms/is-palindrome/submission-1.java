class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        
        while (start < end) {
            // Move start pointer right until a letter or digit is found
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            // Move end pointer left until a letter or digit is found
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            
            // Compare characters after converting to lowercase
            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            
            // Move both pointers inward
            start++;
            end--;
        }
        
        return true;
    }
}

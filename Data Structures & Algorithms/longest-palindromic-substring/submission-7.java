class Solution {
    public String longestPalindrome(String s) {
        if (s == null) return null;
        if (s.length() == 1) return s;
        char[] str = s.toCharArray();
        int res = 0;
        int reslen = 0;
        for(int i = 0; i < str.length-1; i++){
            //check odd len pal
            int currodd = 0;
            int curroddlen = 0;
            int curreven = 0;
            int currevenlen = 0;
            int g = i+1;
            int k = i-1;
            while(k >= 0 && g < str.length){
                if(str[k] != str[g]){
                    break;
                }
                currodd = k;
                curroddlen = g-k;
                g++;
                k--;
            }
            //check even len pal
            int j = i+1;
            int temp = i;
            while(j < str.length && temp >= 0){
                if (str[temp] != str[j]){
                    break;
                }
                curreven = temp;
                currevenlen = j-temp;
                temp--;
                j++;
            }
            if(currevenlen > reslen){
                reslen = currevenlen;
                res = curreven;
            }
            else if (curroddlen > reslen){
                reslen = curroddlen;
                res = currodd;
            }
            else{
                continue;
            }
        }
        return s.substring(res, res+reslen+1);
    }
}

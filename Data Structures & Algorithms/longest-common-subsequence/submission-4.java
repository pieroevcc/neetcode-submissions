class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        if (text1.length() == 0 || text1.length() == 0) return 0;
        int[][] dp = new int[text1.length() +1][text2.length()+1];
        char[] tex1 = text1.toCharArray();
        char[] tex2 = text2.toCharArray();
        for(int i = 1; i < tex1.length+1; i++){
            for(int j = 1; j < tex2.length+1; j++){
                if (tex1[i-1] == tex2[j-1]){
                    dp[i][j] = dp[i-1][j-1] +1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return  dp[tex1.length][tex2.length];

    }
}

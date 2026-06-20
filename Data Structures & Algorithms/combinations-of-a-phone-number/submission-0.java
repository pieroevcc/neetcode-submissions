class Solution {
    //map the demtermined strings to integer
    //loop through digits
    //backtracking part: pair each string char from every digit to each other
    List<String> res = new ArrayList<>();
    Map<Integer,String> map = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return new ArrayList<>();
        List<String> letter = Arrays.asList("abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz");
        for(int i = 2; i < 10; i++){
            map.put(i, letter.get(i-2));
        }
        
        backtrack(digits.toCharArray(), new String(), 0, 0);
        return res;
    }

    public void backtrack(char[] digits, String curr, int digit, int i){
        if (curr.length() == digits.length){
            res.add(curr);
            return;
        }
        digit = digits[i] - '0';
        String s = map.get(digit);
        for(char t : s.toCharArray()){
            backtrack(digits, curr + t, digit, i+1);
        }
        return;
    }
}

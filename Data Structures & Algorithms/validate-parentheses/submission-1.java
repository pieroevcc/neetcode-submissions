class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = Map.of(
            '[', ']',
            '(', ')',
             '{','}'
             );
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                // It's an opening bracket, push the expected closer to the stack
                stack.push(map.get(c));
            } else {
                // It's a closing bracket
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

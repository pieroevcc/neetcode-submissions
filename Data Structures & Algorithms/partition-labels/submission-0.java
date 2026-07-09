class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list = new ArrayList<>();
        Map<Character, Integer> freq = new HashMap<>();
        char[] str = s.toCharArray();
        for(char c : str){
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        list.add(0);
        int start = 0;
        int length = 0;
        for(int i = 0; i < str.length; i++){
            if (freq.get(str[i]) > 0){
                list.set(start, list.get(start) + freq.get(str[i]));
                length += freq.get(str[i]);
                freq.put(str[i], 0);
            }
            if (i == length-1){
                list.add(0);
                start++;
            }
        }
        list.removeLast();
        return list;
    }
}

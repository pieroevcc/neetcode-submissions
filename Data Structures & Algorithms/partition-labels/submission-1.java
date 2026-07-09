class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        char[] str = s.toCharArray();
        for(int i = 0; i < str.length; i++){
            freq.put(str[i], i);
        }
        List<Integer> list = new ArrayList<>();
        int start = 0;
        int length = 0;
        for(int i = 0; i < str.length; i++){
            length++;
            start = Math.max(start, freq.get(str[i]));
            if (i == start){
                list.add(length);
                length = 0;            
            }
        }
        return list;
    }
}

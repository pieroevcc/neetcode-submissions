
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        
        int window = s1.length();
        char[] new1 = s1.toCharArray();
    
        Arrays.sort(new1); 
        
        char[] new2 = s2.toCharArray();
        
       
        for(int i = 0; i < s2.length() - window +1; i++){
           
            char[] currentWindow = Arrays.copyOfRange(new2, i, i + window);
            Arrays.sort(currentWindow);
            
           
            int count = 0;
            for(int j = 0; j < window; j++){
                if(new1[j] == currentWindow[j]){
                    count++;
                }
            }
            
            if(count == window){
                return true;
            }
        }
        return false;
    }
}
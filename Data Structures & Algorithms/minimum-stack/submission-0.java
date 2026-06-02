class MinStack {

    ArrayList<Integer> s = new ArrayList<>();
 
    public MinStack() {
        ArrayList<Integer> s = new ArrayList<>();
    }
    
    public void push(int val) {
        s.add(val);
    }
    
    public void pop() {
        s.remove(s.size()-1);
    }
    
    public int top() {
        return s.get(s.size()-1);
    }
    
    public int getMin() {
        int min = s.get(0);
        for(int i = 1; i < s.size(); i++){
            int cur = s.get(i);
            if(cur < min){
                min = cur;
            }
        }
        return min;
    }
}

class MinStack {

    private Stack<Integer> s;
 
    public MinStack() {
        s = new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
    }
    
    public void pop() {
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        Stack<Integer> min = new Stack<>();
        int mini = s.peek();
        while(!s.isEmpty()){
            mini = Math.min(mini, s.peek());
            min.push(s.pop());
        }

        while(!min.isEmpty()){
            s.push(min.pop());
        }

        return mini;
    }
}

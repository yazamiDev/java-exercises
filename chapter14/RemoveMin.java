/**
 * Write a method removeMin that accepts a Stack of integers as a 
 * parameter and removes and returns the smallest value from the 
 * stack.
 */

public int removeMin(Stack<Integer> s) {
    Queue<Integer> q = new LinkedList<Integer>();
    int min = Integer.MAX_VALUE;
    
    while(!s.isEmpty()) {
        int n = s.pop();
        
        if(n < min) {
            min = n;
        }
        
        q.add(n);
    }
    
    while(!q.isEmpty()) {
        int n = q.remove();
        
        if(n > min) {
            s.push(n);
        }
    }
    
    while(!s.isEmpty()) {
        q.add(s.pop());
    }
        
    while(!q.isEmpty()) {
        s.push(q.remove());
    }
    
    return min;
}
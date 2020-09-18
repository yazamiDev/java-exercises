/**
 * Write a method isConsecutive that takes a stack of integers as a 
 * parameter and that returns whether or not the stack contains a 
 * sequence of consecutive integers starting from the bottom of the 
 * stack (returning true if it does, returning false if it does not). 
 * Consecutive integers are integers that come one after the other, 
 * as in 5, 6, 7, 8, 9, etc.
 */

public boolean isConsecutive(Stack<Integer> s) {
    Queue<Integer> q = new LinkedList<Integer>();
    boolean isConsecutive = true;
    
    //add everything to queue
    while(!s.isEmpty()) {
        q.add(s.pop());
    }
    
    // add everything to stack 
    while(!q.isEmpty()) {
        s.push(q.remove());
    }
    
    while(!s.isEmpty()) {
        int n1 = s.pop();
        
        if(s.isEmpty()) {
            q.add(n1);
            break;
        }
        
        int n2 = s.peek();
        
        if(n1+1 != n2) {
            isConsecutive = false;
        }
        
        q.add(n1);
    }
    
    while(!q.isEmpty()) {
        s.push(q.remove());
    }
    
    return isConsecutive;
}
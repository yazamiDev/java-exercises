/**
 * Write a method called maxToTop that takes a stack of integers as a 
 * parameter and moves the largest value in the stack to the top of 
 * the stack, leaving all other values in their original order. You 
 * may assume that the stack does not contain any duplicates. For 
 * example, if a stack s stores [27, 5, 42, -11, 0, 19], the call 
 * of maxToTop(s) should change it to store [27, 5, -11, 0, 19, 42]. 
 * If the stack is empty, your method should not change it. Use one 
 * queue as auxiliary storage.
 */

public void maxToTop(Stack<Integer> s) {
    Queue<Integer> q = new LinkedList<Integer>();
    int max = Integer.MIN_VALUE;
    
    while(!s.isEmpty()) {
        int n = s.pop();
        
        if(n > max) {
            max = n;
        }
        
        q.add(n);
    }
    
    while(!q.isEmpty()) {
        int n = q.remove();
        
        if(n != max) {
            s.push(n);
        }
    }
    
    while(!s.isEmpty()) {
        q.add(s.pop());
    }
        
    while(!q.isEmpty()) {
        s.push(q.remove());
    }
    
    s.add(max);
    
}
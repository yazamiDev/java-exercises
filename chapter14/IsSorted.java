/**
 * Write a method isSorted that accepts a stack of integers as a 
 * parameter and returns true if the elements in the stack occur 
 * in ascending (non-decreasing) order from top to bottom, and 
 * false otherwise. That is, the smallest element should be on top, 
 * growing larger toward the bottom.
 */

public boolean isSorted(Stack<Integer> s1) {
    if(s1.size() <= 1)
        return true;
        
    Stack<Integer> s2 = new Stack<Integer>();
    boolean sorted = true;
    int top = s1.pop();
    s2.push(top);
    
    while(!s1.isEmpty()) {
        int n = s1.pop();
        
        if(n < top)
            sorted = false;
            
        top = n;
        s2.push(top);
    }
    
    while(!s2.isEmpty())
        s1.push(s2.pop());
        
    return sorted;
    
}
/**
 * Write a method compressDuplicates that accepts a stack of 
 * integers as a parameter and that replaces each sequence of 
 * duplicates with a pair of values: a count of the number of 
 * duplicates, followed by the actual duplicated number.
 */

public void compressDuplicates(Stack<Integer> s) {
    Queue<Integer> q = new LinkedList<Integer>();
    int top = s.pop();
    int count = 1;
    
    while(!s.isEmpty()) {
        int n = s.pop();
        
        if(top == n) {
            count++;
        } else {
            q.add(top);
            q.add(count);
            count = 1;
            top = n;
        }
    }
    
    q.add(top);
    q.add(count);
    
    while(!q.isEmpty())
        s.push(q.remove());
        
    while(!s.isEmpty())
        q.add(s.pop());
        
    while(!q.isEmpty())
        s.push(q.remove());
}
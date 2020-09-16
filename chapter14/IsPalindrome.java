/**
 * Write a method isPalindrome that takes a queue of integers as a 
 * parameter and returns true if the numbers in the queue represent 
 * a palindrome (and false otherwise). A sequence of numbers is 
 * considered a palindrome if it is the same in reverse order.
 */

public boolean isPalindrome(Queue<Integer> q) {
    Stack<Integer> s = new Stack<Integer>();
    boolean palindrome = true;
    int size = q.size();
    
    for(int i=0; i<size; i++) {
        int n = q.remove();
        
        q.add(n);
        s.push(n);
    }
    
    while(!s.isEmpty()) {
        int n1 = q.remove();
        int n2 = s.pop();
        
        if(n1 != n2) {
            palindrome = false;
        }
        
        q.add(n1);
    }
    
    return palindrome;
}
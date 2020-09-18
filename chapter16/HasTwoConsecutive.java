/**
 * Write a method hasTwoConsecutive that returns whether or not a 
 * list of integers has two adjacent numbers that are consecutive 
 * integers (true if such a pair exists and false otherwise). 
 */

public boolean hasTwoConsecutive() {
    boolean hasTwoConsecutive = false;
    
    if(front == null) {
        return hasTwoConsecutive;
    }
    
    ListNode current = front;
    while(current.next != null) {
        int n1 = current.data;
        int n2 = current.next.data;
        if(n1+1 == n2) {
            return true;
        }
        current = current.next;
    }
    
    return hasTwoConsecutive;
    
}
/**
 * Write a method min that returns the minimum value in a list of 
 * integers. If the list is empty, it should throw a 
 * NoSuchElementException.
 */

public int min() { 
    if(front == null) {
        throw new NoSuchElementException();
    }
    
    int min = Integer.MAX_VALUE;
    
    ListNode current = front;
    while(current != null) {
        if(current.data < min) {
            min = current.data;
        }
        current = current.next;
    }
    
    return min;
    
}
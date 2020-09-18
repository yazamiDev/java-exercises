/**
 * Write a method deleteBack that deletes the last value (the value at 
 * the back of the list) and returns the deleted value. If the list is 
 * empty, your method should throw a NoSuchElementException.
 */

public int deleteBack() {
    int value;
    
    if(front == null) {
        throw new NoSuchElementException();
    }
    
    if(front.next == null) {
        value = front.data;
        front = null;
        return value;
    }
    
    ListNode current = front;
    while(current.next.next != null) {
        current = current.next;
    }
    
    value = current.next.data;
    current.next = null;
    return value;
    
}
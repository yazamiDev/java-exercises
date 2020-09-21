/**
 * Write a method transferFrom that accepts a second 
 * LinkedIntList as a parameter and that moves values 
 * from the second list to this list. You are to attach 
 * the second list's elements to the end of this list. 
 * You are also to empty the second list.
 */

public void transferFrom(LinkedIntList second) {
    if (front == null) {
        front = second.front;
        second.front = null;
        return;
    }
    
    ListNode current = front;
    while(current.next != null) {
        current = current.next;
    }
    
    current.next = second.front;
    second.front = null;
}
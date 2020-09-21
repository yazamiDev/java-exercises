/**
 * Write a method compress that could be added to the 
 * LinkedIntList class, that accepts an integer n 
 * representing a "compression factor" and replaces 
 * every n elements with a single element whose data 
 * value is the sum of those n nodes.
 */

public void compress(int n) {
    if(front == null) {
        return;
    }
    
    ListNode current = front;
    ListNode second = current;
    int sum = 0;
    int i = 0;
    
    while(current != null) {
        if(second != null && i < n) {
            sum += second.data;
            second = second.next;
            i++;
        } else {
            current.data = sum;
            current.next = second;
            current = second;
            sum = 0;
            i = 0;
        }
    }
    
}
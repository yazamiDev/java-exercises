/**
 * Write a method removeAll that removes all occurrences of a 
 * particular value. For example, if a variable list contains 
 * the following values:
 * [3, 9, 4, 2, 3, 8, 17, 4, 3, 18]
 * The call of list.removeAll(3); would remove all occurrences 
 * of the value 3 from the list, yielding the following values:
 * [9, 4, 2, 8, 17, 4, 18]
 */

public void removeAll(int value) {
    if(front == null) {
        return;
    }
    
    ListNode current = front;
    ListNode prev = null;
    
    while(current != null) {
        int n = current.data;
        if(n == value) {
            if(prev == null) {
                front = current.next;
            } else {
                prev.next = current.next;
            }
            current = current.next;
        } else {
            prev = current;
            current = prev.next;
        }
    }
}
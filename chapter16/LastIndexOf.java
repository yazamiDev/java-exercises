/**
 * Write a method lastIndexOf that accepts an integer value as a 
 * parameter and that returns the index in the list of the last 
 * occurrence of that value, or -1 if the value is not found in 
 * the list. For example, if a variable list stores the following
 * sequence of values, then the call of list.lastIndexOf(18) 
 * should return 6 because that is the index of the last occurrence 
 * of 18: [1, 18, 2, 7, 18, 39, 18, 40]
 */

public int lastIndexOf(int value) {
    int index = -1;
    int i = 0;
    
    if(front == null) {
        return index;
    }
    
    ListNode current = front;
    while(current != null) {
        int n = current.data;
        if(n == value) {
            index = i;
        }
        i++;
        current = current.next;
           
    }
    return index;
}
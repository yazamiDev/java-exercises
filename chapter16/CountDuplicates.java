/**
 * Write a method countDuplicates that returns the number of duplicates 
 * in a sorted list. The list will be in sorted order, so all of the 
 * duplicates will be grouped together. For example, if a variable 
 * list stores the sequence of values below, the call of 
 * list.countDuplicates() should return 7 because there are 2 
 * duplicates of 1, 1 duplicate of 3, 1 duplicate of 15, 2 duplicates 
 * of 23 and 1 duplicate of 40: 
 * [1, 1, 1, 3, 3, 6, 9, 15, 15, 23, 23, 23, 40, 40]
 */

public int countDuplicates() {
    if(front == null) {
        return 0;
    }

    int count = 0;
    
    ListNode current = front;
    while(current.next != null) {
        int n1 = current.data;
        int n2 = current.next.data;
        if(n1 == n2) {
            count++;
        }
        current = current.next;
    }

    return count;
}
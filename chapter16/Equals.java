/**
 * Write a method equals2 that accepts a second list as a 
 * parameter and that returns true if the two lists are 
 * equal and that returns false otherwise. Two lists are 
 * considered equal if they store exactly the same values 
 * in exactly the same order and have exactly the same length.
 */

public boolean equals2(LinkedIntList second) {
    ListNode i = front;
    ListNode j = second.front;

    while(i != null || j != null) {
        if(i == null) {
            return false;
        }
        
        if(j == null) {
            return false;
        }
        
        int n1 = i.data;
        int n2 = j.data;
        
        if(n1 != n2) {
            return false;
        }
        i = i.next;
        j = j.next;
    }
    return true;
}
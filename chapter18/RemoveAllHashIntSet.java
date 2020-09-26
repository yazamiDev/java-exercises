/**
 * Write a method in the HashIntSet class called removeAll that 
 * accepts another hash set as a parameter and ensures that this 
 * set does not contain any of the elements from the other set. 
 * For example, if the set stores [-2, 3, 5, 6, 8] and the method 
 * is passed [2, 3, 6, 8, 11], your set would store [-2, 5] after 
 * the call.
 */

public void removeAll(HashIntSet set) {
    for(int i=0; i<set.elementData.length; i++) {
        Node n = set.elementData[i];
        
        while(n != null) {
            remove(n.data);
            n = n.next;
        }
    }
}
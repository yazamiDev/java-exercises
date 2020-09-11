/**
 * Write a method removeAll that takes an integer value as a 
 * parameter and that removes all occurrences of the given value 
 * from the list.
 */

public void removeAll(int n) {
    for(int i=0; i<size; i++) {
        if(elementData[i] == n) {
            remove(i);
            i--;
        }
    }
    
}
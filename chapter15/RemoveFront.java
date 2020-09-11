/**
 * Write a method removeFront that takes an integer n as a 
 * parameter and that removes the first n values from a list 
 * of integers.
 */

public void removeFront(int n) {
    for(int i=n; i<size; i++) {
        elementData[i-n] = elementData[i];
    }
    
    size -= n;
}
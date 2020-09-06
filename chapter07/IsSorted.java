/**
 * Write a static method named isSorted that accepts an array of doubles as a 
 * parameter and returns true if the list is in sorted (nondecreasing) order 
 * and false otherwise. Assume the array has at least one element. A 
 * one-element array is considered to be sorted.
 */

public boolean isSorted(double[] list) {
    for(int i=0; i<list.length - 1; i++) {
        if(list[i] > list[i+1]) {
            return false;
        }
    }

    return true;
}
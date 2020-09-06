/**
 * Write a method called append that accepts two integer arrays as parameters 
 * and returns a new array that contains the result of appending the second 
 * array's values at the end of the first array.
 */

public int[] append(int[] a1, int[] a2) {    
    int[] a3  = new int[a1.length + a2.length];
    int i = 0;
    
    for(int j=0; j<a1.length; j++) {
        a3[i] = a1[j];
        i++;
    }
    
    for(int j=0; j<a2.length; j++) {
        a3[i] = a2[j];
        i++;
    }
    
    return a3;
    
}
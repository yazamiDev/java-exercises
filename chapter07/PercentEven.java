/**
 * Write a method called percentEven that accepts an array of integers as a 
 * parameter and returns the percentage of even numbers in the array as a real 
 * number.  If the array contains no even elements or no elements at all, 
 * return 0.0.
 */

public double percentEven(int[] list) {
    int evenCount = 0;
    
    if(list.length == 0) {
        return 0.0;
    }
    
    for(int i=0; i<list.length; i++) {
        if(list[i] % 2 == 0) {
            evenCount++;
        }
    }

    return evenCount * 100.0 / list.length;    
}
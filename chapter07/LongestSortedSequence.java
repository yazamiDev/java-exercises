/**
 * Write a method named longestSortedSequence that accepts an array of 
 * integers as a parameter and that returns the length of the longest sorted 
 * (nondecreasing) sequence of integers in the array. Notice that sorted means
 * nondecreasing, which means that the sequence could contain duplicates. Your 
 * method should return 0 if passed an empty array.
 */

public int longestSortedSequence(int[] list) {
    int length = 1;
    int maxLength = 1;
        
    if(list.length == 0) {
        return 0;
    }
        
    for(int i=0; i<list.length-1; i++) {
        if(list[i] <= list[i+1]) {
            length++;
        } else {
            if(length>maxLength) {
                maxLength = length;
            }
            length = 1;
        }
    }

    return Math.max(maxLength, length);
}
/**
 * Write a method longestSortedSequence that returns the 
 * length of the longest sorted sequence within a list of 
 * integers. 
 */

public int longestSortedSequence() {
    if(size == 0) {
        return 0;
    }
    
    int maxLength = 1;
    int count = 1;
    
    for(int i=0; i<size-1; i++) {
        if(elementData[i] <= elementData[i+1]) {
            count++;            
        } else {
            if(maxLength < count) {
                maxLength = count;
            }
            count = 1;
        }
    }
    
    return Math.max(maxLength, count);
}
/**
 * Write a method isPairwiseSorted that returns whether or 
 * not a list of integers is pairwise sorted (true if it is, 
 * false otherwise). A list is considered pairwise sorted if 
 * each successive pair of numbers is in sorted (non-decreasing) 
 * order.
 */

public boolean isPairwiseSorted() {
    for(int i=0; i<size-1; i+=2) {
        if(elementData[i] > elementData[i+1]) {
            return false;
        }
    }
    
    return true;
}
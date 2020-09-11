/**
 * Write a method printInversions that lists all inversions 
 * in a list of integers. An inversion is defined as a pair 
 * of numbers where the first appears before the second in 
 * the list, but the first is greater than the second. Thus, 
 * for a sorted list such as [1, 2, 3, 4] there are no inversions 
 * at all, and printInversions would produce no output. Suppose 
 * that a variable called list stores a list in reverse order, 
 * as in [4, 3, 2, 1]. 
 */

public void printInversions() {
    for(int i=0; i<size; i++) {
        for(int j=i+1; j<size; j++) {
            if(elementData[i] > elementData[j]) {
                System.out.println("(" + elementData[i] + ", " + elementData[j] + ")");
            }
        }
    }
    
}
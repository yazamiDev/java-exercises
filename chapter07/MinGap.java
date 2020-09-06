/**
 * Write a method named minGap that accepts an integer array as a parameter 
 * and returns the minimum 'gap' between adjacent values in the array. The gap 
 * between two adjacent values in a array is defined as the second value minus 
 * the first value. If you are passed an array with fewer than 2 elements, you 
 * should return 0
 */

private static int minGap(int[] list) {
    if(list.length < 2) {
        return 0;
    } 
    
    int min = list[1] - list[0];
    
    for(int i=0; i<list.length-1; i++) {
        int temp = list[i+1] - list[i];
        
        if(temp < min) {
            min = temp;
        }
    }

    return min;
}
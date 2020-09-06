/**
 * Write a method called stdev that returns the standard deviation of an array 
 * of integers. Standard deviation is computed by taking the square root of 
 * the sum of the squares of the differences between each element and the mean,
 * divided by one less than the number of elements. You may assume that the 
 * array passed is non-null and contains at least two values, because the 
 * standard deviation is undefined otherwise.
 */

public double stdev(int[] list) {
    double avg = 0;
    double num = 0;
    
    for(int i=0; i<list.length; i++) {
        avg += list[i]; 
    }
    
    avg /= list.length; 
    
    for(int i = 0; i < list.length; i++) {
        num += (list[i] - avg) * (list[i] - avg);
    }
    
    return Math.sqrt(num / (list.length - 1));
}
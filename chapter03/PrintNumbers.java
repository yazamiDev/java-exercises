/**
 * Write a method called printNumbers that accepts a maximum number as a 
 * parameter and prints each number from 1 up to that maximum, inclusive, 
 * boxed by square brackets. You may assume that the value passed to 
 * printNumbers is 1 or greater.
 * 
 * [1] [2] [3] [4] [5] [6] [7] [8] [9] [10] [11] [12] [13] [14] [15]
 * [1] [2] [3] [4] [5]
 */

public static void printNumbers(int maxNumber) {
    for(int i=1; i<= maxNumber; i++) {
        System.out.print("[" + i + "] ");
    }
}
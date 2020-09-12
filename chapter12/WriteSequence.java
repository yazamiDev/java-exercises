/**
 * Write a method writeSequence that accepts an integer n 
 * as a parameter and prints a symmetric sequence of n 
 * numbers with descending integers ending in 1 followed 
 * by ascending integers beginning with 1
 */

public void writeSequence(int n) {
    int edge = (int) Math.ceil(n/2.0);
    
    if(n < 1) {
       throw new IllegalArgumentException();
    }
    
    if(n == 1) {
        System.out.print("1");
        return;
        
    } else if(n == 2) {
        System.out.print("1 1");
        return;
    } else {
        System.out.print(edge + " ");
        writeSequence(n-2);
        System.out.print(" " + edge);
    }
    
}
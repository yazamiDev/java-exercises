/**
 * Write a method multiplyEvens that returns the product of 
 * the first n even integers.
 */

public int multiplyEvens(int n) {
    if(n < 1) {
        throw new IllegalArgumentException();
    }
    
    if(n == 1) {
        return 2;
    }
    
    return 2 * n * multiplyEvens(n-1);
    
}
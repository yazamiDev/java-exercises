/**
 * Write a recursive method digitMatch that accepts two 
 * non-negative integers as parameters and that returns 
 * the number of digits that match between them. Two 
 * digits match if they are equal and have the same 
 * position relative to the end of the number (i.e. 
 * starting with the ones digit). In other words, the 
 * method should compare the last digits of each number, 
 * the second-to-last digits of each number, the third-to-last 
 * digits of each number, and so forth, counting how 
 * many pairs match.
 */

public int digitMatch(int n1, int n2) {
    if(n1 < 0 || n2 < 0)
        throw new IllegalArgumentException();
        
    if(n1 < 10 || n2 < 10)
        return n1 % 10 == n2 % 10 ? 1 : 0;
        
    if(n1 % 10 == n2 % 10)
        return 1 + digitMatch(n1/10, n2/10);
        
    return digitMatch(n1/10, n2/10);
}
/**
 * Write a recursive method repeat that accepts a string s 
 * and an integer n as parameters and that returns a String 
 * consisting of n copies of s.
 */

public String repeat(String str, int n) {
    if(n < 0) {
        throw new IllegalArgumentException();
    }
    
    if(n == 0) {
        return "";
    }
    
    if(n == 1) {
        return str;
    }
    
    return str + repeat(str, n-1);
   
}
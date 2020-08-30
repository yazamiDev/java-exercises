/**
 * Write a method named numUnique that takes three integers as parameters and 
 * that returns the number of unique integers among the three.
 */

public int numUnique(int n1, int n2, int n3) {
    int result = 0;
    
    if(n1 == n2 && n2 == n3) {
        result = 1;
        return result;

    } else if (n1 == n2 || n1 == n3 || n2 == n3) {
        result = 2;
        return result;

    } else {
        result = 3;
        return result;
    }
}
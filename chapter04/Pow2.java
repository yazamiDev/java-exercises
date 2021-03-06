/**
 * Write a method named pow2 (a variation of the previous pow exercise) that 
 * accepts a real number base and an integer exponent as parameters and 
 * returns the base raised to the given power. Your code should work for both 
 * positive and negative exponents.
 */

public double pow2(double b, int e) {
    double result = 1;
    
    for(int i=0; i<Math.abs(e); i++) {
        result *= b;
    }
    
    if(e < 0) {
        return 1 / result;
    }
    return result;
    
}
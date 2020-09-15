/**
 * Write a method evenDigits that accepts an 
 * integer parameter n and that returns the integer 
 * formed by removing the odd digits from n.
 */

public int evenDigits(int n) {
    if(n == 0) return 0;
        
    int last = n % 10;
    if(last % 2 == 0) return 10 * evenDigits(n / 10) + last;
        
    return evenDigits(n / 10);
}
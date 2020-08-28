/**
 * Write a method called printPowersOfN that accepts a base and an exponent as 
 * arguments and prints each power of the base from 0 up to that maximum power,
 * inclusive. You may assume that the exponent passed to printPowersOfN has a 
 * value of 0 or greater.
 * 
 * 1 4 16 64
 * 1 5 25 125 625 3125 15625
 * 1 -2 4 -8 16 -32 64 -128 256
 */

private void printPowersOfN(int base, int exponent) {
    for(int i=0; i<=exponent; i++) {
        System.out.print((int)Math.pow(base, i) + " ");
    }
}
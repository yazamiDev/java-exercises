/**
 * rite a method called printPowersOf2 that accepts a maximum number as an 
 * argument and prints each power of 2 from 20 (1) up to that maximum power, 
 * inclusive.You may assume that the value passed to printPowersOf2 is 0 or 
 * greater.
 * 
 * 1 2 4 8
 * 1 2 4 8 16 32 64 128 256 512 1024
 */

public static void printPowersOf2(int maxNumber) {
    for(int i=0; i <= maxNumber; i++) {
        System.out.print((int)Math.pow(2, i) + " ");
    }
}
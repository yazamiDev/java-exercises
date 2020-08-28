/**
 * Modify your code from the previous exercise so that it could easily 
 * be modified to display a different range of numbers (instead of 
 * 1234567890) and a different number of repetitions of those numbers 
 * (instead of 60 total characters), with the vertical bars still matching 
 * up correctly. Write a complete class named NumbersOutput. Use two class
 * constants instead of "magic numbers,", with one constant set to 6 
 * for the number of repetitions, and the other set to 10 for the range 
 * of numbers. Put the for loop code in your class's main method.
 *
 *          |         |         |         |         |         |
 * 123456789012345678901234567890123456789012345678901234567890
 */

public class NumbersOutput {
    public static final int REP_NUM = 6;
    public static final int RANGE_NUM = 10;
    
    public static void main(String[] args) {
        printLine();
        printNumbers();
    }
        
    private static void printLine() {
        for(int i = 1; i <= REP_NUM; i++) {
            for(int j = 1; j < RANGE_NUM; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
    }
    
    private static void  printNumbers() {
        for(int i = 1; i <= RANGE_NUM*REP_NUM; i++)
            System.out.print(i%RANGE_NUM);
    }
        
}
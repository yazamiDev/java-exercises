/**
 * Write a method writeNums that accepts an integer 
 * parameter n and prints the first n integers starting 
 * with 1 in sequential order, separated by commas.
 */

public void writeNums(int n) {
    if(n < 1) {
        throw new IllegalArgumentException();
    }
    
    if(n == 1) {
        System.out.print(n);
        return;
    } else {
        writeNums(n - 1);
        System.out.print(", " + n);
    }
}
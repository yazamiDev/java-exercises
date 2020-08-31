/**
 * Write a method named negativeSum that accepts a Scanner as a parameter 
 * reading input from a file containing a series of integers, and determine 
 * whether the sum starting from the first number is ever negative. The method 
 * should print a message indicating whether a negative sum is possible and 
 * should return true if a negative sum can be reached and false if not.
 */

public boolean negativeSum(Scanner input) {
    int sum = 0;
    int count = 0;
    
    while(input.hasNext()) {
        int n = input.nextInt();
        sum += n;
        count++;
        if(sum < 0) {
            System.out.print(sum + " after " + count + " steps");
            return true;
        }
    }
    
    System.out.print("no negative sum");
    return false;
}
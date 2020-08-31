/**
 * Write a method named evenNumbers that accepts a Scanner as a parameter 
 * reading input from a file containing a series of integers, and report 
 * various statistics about the integers. You may assume that there is at 
 * least one integer in the file. Report the total number of numbers, the sum 
 * of the numbers, the count of even numbers and the percent of even numbers.
 */

public void evenNumbers(Scanner input) {
    int countTotal = 0;
    int countEven = 0;
    int sumCount = 0;
    
    while(input.hasNext()) {
        int n = input.nextInt();
        countTotal++;
        sumCount += n;
        if(n % 2 == 0) {
            countEven++;
        }
    }
     
    double evenPercent = (double)(countEven * 100) / countTotal;
    System.out.println(countTotal + " numbers, sum = " + sumCount);
    System.out.println(countEven + " evens (" + String.format("%.2f",evenPercent) + "%)" );
    
}
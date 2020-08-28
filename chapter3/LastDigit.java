/**
 * Write a method named lastDigit that returns the last digit of an integer. 
 * It should work for negative numbers as well.
 */

private int lastDigit(int number) {
    return Math.abs(number % 10);
}
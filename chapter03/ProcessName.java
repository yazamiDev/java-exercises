/**
 * Write a method called processName that accepts a Scanner for the console as 
 * a parameter and that prompts the user to enter his or her full name, then 
 * prints the name in reverse order (i.e., last name, first name). You may 
 * assume that only a first and last name will be given. You should read the 
 * entire line of input at once with the Scanner and then break it apart as 
 * necessary.
 */

public void processName(Scanner c) {
    System.out.print("Please enter your full name: ");
    String f = c.next();
    String l = c.next();
    System.out.print("Your name in reverse order is " + l + ", " + f);
}
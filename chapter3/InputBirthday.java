/**
 * Write a method called inputBirthday that accepts a Scanner for the console 
 * as a parameter and prompts the user to enter a month, day, and year of 
 * birth, then prints the birthdate in a suitable format.
 */

public void inputBirthday(Scanner c) {
    System.out.print("On what day of the month were you born? ");
    int d = c.nextInt();

    System.out.print("What is the name of the month in which you were born? ");
    String m = c.next();

    System.out.print("During what year were you born? ");
    int y = c.nextInt();

    System.out.println("You were born on " + m + " " + d + ", " + y + ". You're mighty old!");
}
/**
 * Write a method starString that accepts an integer 
 * parameter n and returns a string of stars (asterisks) 
 * 2n long (i.e., 2 to the nth power).
 */

public String starString(int n) {
    if(n < 0) {
        throw new IllegalArgumentException();
    }
    
    if(n == 0) {
        return "*";
    } else {
        return starString(n-1) + starString(n-1);
    }
}


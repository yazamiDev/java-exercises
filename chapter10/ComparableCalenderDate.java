/**
 * Comparable by adding an appropriate compareTo method. Dates that 
 * occur chronologically earlier should be considered "less" than 
 * dates that occur later.
 * 
 * You may assume that dates are constructed with appropriate values: 
 * Months will be between 1 and 12, days will be between 1 and 31 and 
 * years will be four-digit numbers. Assume that the toString method 
 * produces a standard format with two digits for the month and two 
 * digits for the day, including leading zeros if necessary. For 
 * example, January 7th, 2005, would return the string "2005/01/07".
 */

public int compareTo(CalendarDate date) {  
    if(year < date.year) {
        return -1;
    } else if(year>date.year) {
        return 1;
    }
    
    if(month < date.month) {
        return -1;
    } else if(month>date.month) {
        return 1;
    }
    
    if(day < date.day) {
        return -1;
    } else if (day>date.day) {
        return 1;
    }
    
    return 0;
}
/**
 * Write a method called stutter that accepts a 
 * parameter and returns the String with its 
 * characters returns repeated twice. For example, 
 * stutter("Hello!") returns "HHeelllloo!!"
 */

public String stutter(String str) {
    StringBuilder result = new StringBuilder();

    for(int i=0; i<str.length(); i++) {
        result.append(str.charAt(i));
        result.append(str.charAt(i));
    }

    return result.toString();
     
}
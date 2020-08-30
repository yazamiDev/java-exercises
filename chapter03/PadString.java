/**
 * Write a method padString that accepts two parameters: a String and an 
 * integer representing a length. The method should pad the parameter 
 * string with spaces until its length is the given length. For 
 * example, padString("hello", 8) should return "   hello".
 */

public String padString(String s, int n) {
    int wordLength = s.length();
    for(int i=0; i<n-wordLength; i++) {
        s = " " + s;
    }
    return s;
}
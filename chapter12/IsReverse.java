/**
 * rite a recursive method isReverse that accepts two strings as a 
 * parameter and returns true if the two strings contain the same 
 * sequence of characters as each other but in the opposite order 
 * (ignoring capitalization), and false otherwise. For example, the 
 * string "hello" backwards is "olleh", so a call of isReverse("hello", 
 * "olleh") would return true. Since the method is case-insensitive, 
 * you would also get a true result from a call of isReverse("Hello", 
 * "oLLEh"). The empty string, as well as any one-letter string, is 
 * considered to be its own reverse. The string could contain 
 * characters other than letters, such as numbers, spaces, or other 
 * punctuation; you should treat these like any other character. 
 * The key aspect is that the first string has the same sequence 
 * of characters as the second string, but in the opposite order, 
 * ignoring case. 
 */

public boolean isReverse(String str1, String str2) {
    if(str1.length() != str2.length()) return false;
        
    if(str1.length() == 0) return true;
        
    char c1 = Character.toLowerCase(str1.charAt(0));
    char c2 = Character.toLowerCase(str2.charAt(str2.length()-1));
    return c1 == c2 && isReverse(str1.substring(1), str2.substring(0, str2.length()-1));
}
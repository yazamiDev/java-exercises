/**
 * Write a method called printReverse that accepts a String as its parameter 
 * and prints the characters in opposite order. If the empty string is passed, 
 * no output is produced. Your method should produce a complete line of output.
 */

public void printReverse(String s) {
    for(int i = s.length() - 1; i>=0; i--) {
        System.out.print(s.charAt(i));
    }
}
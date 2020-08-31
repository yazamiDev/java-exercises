/**
 * Write a static method named collapseSpaces that accepts a Scanner 
 * representing a file as a parameter and writes that file's text to the 
 * console, with multiple spaces or tabs reduced to single spaces between 
 * words that appear on the same line. Each word is to appear on the same line 
 * in output as it appears in the file. Notice that lines can be blank.
 */

public String readEntireFile(Scanner sc) {
    StringBuilder text = new StringBuilder();
    
    while(sc.hasNextLine()) {
        text.append(sc.nextLine() + "\n");
    }
    
    return text.toString();
}
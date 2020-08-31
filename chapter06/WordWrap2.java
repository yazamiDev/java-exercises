/**
 * Modify the preceding wordWrap method into a new wordWrap2 method that 
 * accepts a second parameter for a PrintStream to write the data, and outputs 
 * the newly wrapped text to that PrintStream rather than to the console. 
 * Also, modify it to use a local variable to store the maximum line length 
 * rather than hard-coding 60.
 */

public void wordWrap2(Scanner input, PrintStream output) {
    int max = 60;
    
    while(input.hasNextLine()) {
        String line = input.nextLine();
        
        while(line.length() > max) {
            output.println(line.substring(0,60));
            line = line.substring(60);

        }
        
        output.println(line);

    }
}